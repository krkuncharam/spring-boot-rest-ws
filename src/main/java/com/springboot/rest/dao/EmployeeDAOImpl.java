package com.springboot.rest.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.rest.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO
{
	//@Autowired
	//private EntityManager entityManager;

	@Override
	@Transactional
	public Employee findByApplicationID(Integer applicationId)
	{
		//return entityManager.find(Employee.class, applicationId);
		
		return new Employee(1, "Sachin");
	}

	@Override
	@Transactional
	public List<Employee> findAllEmployees()
	{
		// List<Employee> query = entityManager.createQuery("SELECT e FROM
		// Employee e", Employee.class).getResultList();
		List<Employee> query = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "Sachin");
		Employee e2 = new Employee(2, "Rahul");

		query.add(e1);
		query.add(e2);

		return query;
	}
}
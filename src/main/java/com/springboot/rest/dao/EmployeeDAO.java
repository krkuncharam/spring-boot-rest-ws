package com.springboot.rest.dao;

import java.util.List;

import com.springboot.rest.model.Employee;

public interface EmployeeDAO // extends JpaRepository<Employee, Integer>
{
	public Employee findByApplicationID(Integer applicationId);

	public List<Employee> findAllEmployees();
}
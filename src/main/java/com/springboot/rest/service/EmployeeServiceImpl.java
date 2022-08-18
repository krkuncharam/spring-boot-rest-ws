package com.springboot.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.dao.EmployeeDAO;
import com.springboot.rest.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeDAO employeeDAO;

	@Override
	public Employee getEmployeeDetailsById(Integer employeeId)
	{
		return employeeDAO.findByApplicationID(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees()
	{
		return employeeDAO.findAllEmployees();
	}
}
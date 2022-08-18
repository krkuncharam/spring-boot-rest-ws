package com.springboot.rest.service;

import java.util.List;

import com.springboot.rest.model.Employee;

public interface EmployeeService
{
	public Employee getEmployeeDetailsById(Integer employeeId);

	public List<Employee> getAllEmployees();
}
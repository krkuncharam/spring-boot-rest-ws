package com.springboot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.model.Employee;
import com.springboot.rest.service.EmployeeService;

@RestController
public class EmployeeController
{
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable Integer employeeId)
	{
		return employeeService.getEmployeeDetailsById(employeeId);
	}

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getAllEmployee()
	{
		System.out.println("\nInside getAllEmployees\n");
		return employeeService.getAllEmployees();
	}
}
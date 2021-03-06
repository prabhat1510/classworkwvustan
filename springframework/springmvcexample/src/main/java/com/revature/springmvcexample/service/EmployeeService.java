package com.revature.springmvcexample.service;

import java.util.List;

import com.revature.springmvcexample.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();
	
	public List<Employee> getAllEmployees();
	
	public Boolean addEmployee(Employee employee);

}

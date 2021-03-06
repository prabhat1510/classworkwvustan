package com.revature.springmvcexample.dao;

import java.util.List;

import com.revature.springmvcexample.model.Employee;

public interface EmployeeDAO {
	public List<Employee> getEmployees();
	public List<Employee> getAllEmployees();
	public Boolean addEmployee(Employee employee);
}

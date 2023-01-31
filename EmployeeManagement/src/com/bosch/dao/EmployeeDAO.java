package com.bosch.dao;

import java.util.List;

import com.bosch.entity.Employee;

public interface EmployeeDAO {
	
	public boolean addEmployee(Employee e);
	public List<Employee> getAllEmployessd();
	public boolean deleteEmployee(Employee e);
	public Employee searchEmployee();
	
	

}

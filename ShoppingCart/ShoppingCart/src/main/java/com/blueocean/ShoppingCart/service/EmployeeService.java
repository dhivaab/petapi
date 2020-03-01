package com.blueocean.ShoppingCart.service;

import java.util.List;

import com.blueocean.ShoppingCart.model.Employee;

public interface EmployeeService {
	List<Employee> getEmployees();
	Employee getEmployeebyemployeeNumber(int employeeNumber); 
}

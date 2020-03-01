package com.blueocean.ShoppingCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueocean.ShoppingCart.model.Employee;
import com.blueocean.ShoppingCart.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpln implements EmployeeService{

	@Autowired
	private EmployeeRepository employeerepo;
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return (List<Employee>)employeerepo.findAll();
	}

	@Override
	public Employee getEmployeebyemployeeNumber(int employeeNumber) {
		// TODO Auto-generated method stub
		return employeerepo.findById(employeeNumber).orElse(null);
	}

}

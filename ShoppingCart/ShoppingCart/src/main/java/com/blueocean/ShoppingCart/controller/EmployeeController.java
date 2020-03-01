package com.blueocean.ShoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueocean.ShoppingCart.model.Employee;
import com.blueocean.ShoppingCart.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/employees")
	ResponseEntity<?> getemployees()
	{
		try 
		{
			List<Employee> employees = employeeservice.getEmployees();
			return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
			
		}
		catch(Exception ex)
		{
			return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("employees/{employeenumber}")
	ResponseEntity<?> getEmployeesbyemployeenumber(@PathVariable(value = "employeenumber") int employeenumber) 
	{
		 Employee employee = employeeservice.getEmployeebyemployeeNumber(employeenumber);
		    if (employee == null) {
		        return ResponseEntity.notFound().build();
		    }
		    return ResponseEntity.ok().body(employee);
	}
}

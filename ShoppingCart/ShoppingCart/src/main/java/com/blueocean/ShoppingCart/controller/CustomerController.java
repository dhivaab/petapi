package com.blueocean.ShoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueocean.ShoppingCart.model.Customer;
import com.blueocean.ShoppingCart.service.CustomerService;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/customers")
	ResponseEntity<?> getCustomers() 
	{
		try 
		{
			List<Customer> customers = customerservice.getCustomers();
			return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
			
		}
		catch(Exception ex)
		{
			return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
}

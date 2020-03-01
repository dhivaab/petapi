package com.blueocean.ShoppingCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueocean.ShoppingCart.model.Customer;
import com.blueocean.ShoppingCart.repository.CustomerRepository;

@Service
public class CustomerServiceImpln implements CustomerService {

	@Autowired
	private CustomerRepository customerrepo;
	
	@Override
	public Customer getCustomer(int customerNumber) {
		// TODO Auto-generated method stub
		return customerrepo.findById(customerNumber).orElse(null);
	}
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerrepo.findAll();
	}
}

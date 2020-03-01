package com.blueocean.ShoppingCart.service;


import java.util.List;

import com.blueocean.ShoppingCart.model.Customer;



public interface CustomerService {

	List<Customer> getCustomers();
    Customer getCustomer(int customerNumber);	
}

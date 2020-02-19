package com.blueocean.ShoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueocean.ShoppingCart.model.Orders;
import com.blueocean.ShoppingCart.service.OrderService;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

	@Autowired
	private OrderService orderservice;
	
	@GetMapping("/orders")
	ResponseEntity<?> getOrders() 
	{
		try 
		{
			List<Orders> orders = orderservice.getAllOrders();
			return new ResponseEntity<List<Orders>>(orders,HttpStatus.OK);
			
		}
		catch(Exception ex)
		{
			return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	
}

package com.blueocean.ShoppingCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueocean.ShoppingCart.model.Orders;
import com.blueocean.ShoppingCart.repository.OrderRepository;

@Service
public class OrderServiceImpln implements OrderService {

	@Autowired
	private OrderRepository orderrepo;
	
	@Override
	public List<Orders> getAllOrders() {
		return (List<Orders>)this.orderrepo.findAll();
	}

	@Override
	public Orders getOrder(int orderNumber) {
		// TODO Auto-generated method stub
		return this.orderrepo.findById(orderNumber).orElse(null);
	}

}

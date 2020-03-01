package com.blueocean.ShoppingCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueocean.ShoppingCart.model.Order;
import com.blueocean.ShoppingCart.model.Orderdetail;
import com.blueocean.ShoppingCart.repository.OrderRepository;
import com.blueocean.ShoppingCart.repository.OrderdetailRepository;

@Service
public class OrderServiceImpln implements OrderService {

	@Autowired
	private OrderRepository orderrepo;
	
	@Autowired
	private OrderdetailRepository orderdetailrepo;
	
	@Override
	public List<Order> getAllOrders() {
		return (List<Order>)this.orderrepo.findAll();
	}

	@Override
	public Order getOrder(int orderNumber) {
		// TODO Auto-generated method stub
		return this.orderrepo.findById(orderNumber).orElse(null);
	}

	@Override
	public List<Orderdetail> getOrderdetails() {
		// TODO Auto-generated method stub
		return this.orderdetailrepo.findAll();
	}

	@Override
	public List<Orderdetail> getOrderdetailbyOrderNumber(int orderNumber) {
		// TODO Auto-generated method stub
		return (List<Orderdetail>) this.orderdetailrepo.findById(orderNumber).orElse(null);
	}

}

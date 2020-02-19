package com.blueocean.ShoppingCart.service;

import java.util.List;

import com.blueocean.ShoppingCart.model.Orders;

public interface OrderService {
	
    List<Orders> getAllOrders();
    
    Orders getOrder(int orderNumber);
}

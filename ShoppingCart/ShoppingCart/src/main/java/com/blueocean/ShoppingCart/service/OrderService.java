package com.blueocean.ShoppingCart.service;

import java.util.List;

import com.blueocean.ShoppingCart.model.Order;
import com.blueocean.ShoppingCart.model.Orderdetail;

public interface OrderService {
	
    List<Order> getAllOrders();
    
    Order getOrder(int orderNumber);
    
    List<Orderdetail> getOrderdetails();
    
    List<Orderdetail> getOrderdetailbyOrderNumber(int orderNumber);

}

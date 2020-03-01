package com.blueocean.springcorelearnings.sixproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("orderbao")
public class OrderBAOImpln implements OrderBAO {

	@Autowired
	private OrderDAO orderdao;
	
	public void submitOrder() {
		orderdao.createOrder();
		System.out.println("I am in submit order");
	}

}

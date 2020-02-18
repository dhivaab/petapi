package com.blueocean.springcorelearnings.sixproject;

import org.springframework.stereotype.Component;

@Component("orderdao")
public class OrderDAOImpln implements OrderDAO {

	public void createOrder() {
		System.out.println("creating order");
	}

}

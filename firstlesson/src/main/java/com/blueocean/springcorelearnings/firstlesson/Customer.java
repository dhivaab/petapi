package com.blueocean.springcorelearnings.firstlesson;

import java.util.Map;

public class Customer {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	private Map<Integer,String> products;
}

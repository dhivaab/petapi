package com.blueocean.springcorelearnings.fifthlession;

public class OrderBAOImpln implements OrderBAO {

	
	private OrderDAO orderdao;
	
	public void SubmitOrder() {
		orderdao.createOrder();
		System.out.println("submit order");
	}

	public OrderDAO getOrderdao() {
		return orderdao;
	}

	public void setOrderdao(OrderDAO orderdao) {
		this.orderdao = orderdao;
	}
}

package com.blueocean.springcorelearnings.thirdlession;

public class College {

	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public College(Address address) {
		this.address = address;
	}
	
}

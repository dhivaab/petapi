package com.blueocean.springcorelearnings.firstlesson;

import java.util.Set;

public class Road {
	private String name;
	private Set<String> cars;

	public Set<String> getCars() {
		return cars;
	}
	public void setCars(Set<String> cars) {
		this.cars = cars;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

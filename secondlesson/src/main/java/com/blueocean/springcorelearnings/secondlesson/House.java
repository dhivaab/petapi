package com.blueocean.springcorelearnings.secondlesson;

public class House {
	private int number;
	private String model;
	public House(int number, String model) {
		super();
		this.number = number;
		this.model = model;
	}
	@Override
	public String toString() {
		return "House [number=" + number + ", model=" + model + "]";
	}
}

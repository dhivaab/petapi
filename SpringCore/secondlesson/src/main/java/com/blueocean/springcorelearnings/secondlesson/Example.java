package com.blueocean.springcorelearnings.secondlesson;

public class Example {
	public Example(int a, int b) {
		System.out.println("am in integer");
	}
	public Example(double a, double b) {
		System.out.println("am in double");
	}
	public Example(String a, String b) {
		System.out.println("am in string");
	}
	@Override
	public String toString() {
		return "Example []";
	}
	
}

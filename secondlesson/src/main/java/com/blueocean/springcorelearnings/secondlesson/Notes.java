package com.blueocean.springcorelearnings.secondlesson;

import org.springframework.beans.factory.annotation.Required;

public class Notes {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
}

package com.blueocean.springcorelearnings.thirdlession;

public class Metal {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Metal [id=" + id + ", name=" + name + "]";
	}
}

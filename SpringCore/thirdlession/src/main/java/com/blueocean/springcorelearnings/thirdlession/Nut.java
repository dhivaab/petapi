package com.blueocean.springcorelearnings.thirdlession;

import org.springframework.beans.factory.annotation.Autowired;

public class Nut {
	private int id;
	private String name;
	private Metal metal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Nut [id=" + id + ", name=" + name + ", metal=" + metal + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public Metal getMetal() {
		return metal;
	}
	@Autowired
	public void setMetal(Metal metal) {
		this.metal = metal;
	}
}

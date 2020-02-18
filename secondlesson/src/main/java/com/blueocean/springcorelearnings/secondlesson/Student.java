package com.blueocean.springcorelearnings.secondlesson;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
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
	@PostConstruct
	public void init()
	{
		System.out.println("inside init");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("inside destroy");
	}
}

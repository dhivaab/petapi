package com.blueocean.springcorelearnings.fourlesson;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cognizant")
public class Cognizant {

	@Value("#{88+10}")
	private int id;
	
	@Value("#{5>3?10:20}")
	private int id1;
	
	@Value("#{T(java.lang.Math).abs(-99)}")
	private int id2;

	@Value("#{new String('Hello World')}")
	private String id3;
	public int getId() {
		return id;
	}
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id4;
	
	@Value("#{'kundavai'}")
	private String name ="test";
	public void setId(int id) {
		this.id = id;
	}
	
	@Value("#{2+2>3}")
	private boolean active;
	@Override
	public String toString() {
		return "Cognizant [id=" + id + ", id1=" + id1 + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + ", name="
				+ name + ", active=" + active + "]";
	}
	
	

	

	

	
}

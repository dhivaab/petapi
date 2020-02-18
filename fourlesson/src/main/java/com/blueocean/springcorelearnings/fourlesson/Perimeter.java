package com.blueocean.springcorelearnings.fourlesson;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("perimeter")
public class Perimeter {
	@Value("10")
	private int id;
	@Value("balamurugan")
	private String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}

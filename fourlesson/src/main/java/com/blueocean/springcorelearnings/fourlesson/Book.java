package com.blueocean.springcorelearnings.fourlesson;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("book")
public class Book {
	@Value("20000")
	private int id;
	@Value("#{books}")
	private List<String> names;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
}

package com.blueocean.springcorelearnings.javaconfiguration;

import org.springframework.beans.factory.annotation.Autowired;

public class service {

	@Autowired
	Dao dao;
	public void save() 
	{
		dao.createDao();
	}
	
}
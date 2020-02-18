package com.blueocean.springcorelearnings.javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
	
	@Bean
	public Dao dao() 
	{
		return new Dao();
	}
	@Bean
	public service service()
	{
		return new service();
	}
}

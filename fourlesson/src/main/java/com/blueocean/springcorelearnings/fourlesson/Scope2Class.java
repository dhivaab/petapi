package com.blueocean.springcorelearnings.fourlesson;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("scope2class")
@Scope("prototype")
public class Scope2Class {

	@Override
	public String toString() {
		return "Scope2Class []";
	}
	
}

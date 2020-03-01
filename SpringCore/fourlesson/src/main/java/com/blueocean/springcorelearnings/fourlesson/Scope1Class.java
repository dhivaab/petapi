package com.blueocean.springcorelearnings.fourlesson;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("scope1class")
@Scope("singleton")
public class Scope1Class {

	@Override
	public String toString() {
		return "Scope1Class []";
	}

}

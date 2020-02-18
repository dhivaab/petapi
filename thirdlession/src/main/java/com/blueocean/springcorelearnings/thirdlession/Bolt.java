package com.blueocean.springcorelearnings.thirdlession;

import org.springframework.beans.factory.annotation.Autowired;

public class Bolt {
	
	private Metal metal;
	
	@Autowired
	public Bolt(Metal metal) {
		super();
		this.metal = metal;
	}

	public Metal getMetal() {
		return metal;
	}
	public void setMetal(Metal metal) {
		this.metal = metal;
	}
}

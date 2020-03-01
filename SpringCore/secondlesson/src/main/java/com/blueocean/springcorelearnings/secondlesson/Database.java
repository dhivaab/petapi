package com.blueocean.springcorelearnings.secondlesson;

public class Database {
	private String name;
	private String userid;
	private String password;
	
	public Database(String name, String userid, String password) {
		super();
		this.name = name;
		this.userid = userid;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Database [name=" + name + ", userid=" + userid + ", password=" + password + "]";
	}
	
}

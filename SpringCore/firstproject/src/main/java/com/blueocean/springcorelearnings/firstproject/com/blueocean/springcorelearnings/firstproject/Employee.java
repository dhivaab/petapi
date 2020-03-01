package com.blueocean.springcorelearnings.firstproject;

public class Employee {

	private int Id;
	private String Name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + "]";
	}
}

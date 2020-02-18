package com.blueocean.springcorelearnings.secondlesson;

public class Road {
	private int Id;
	private House house;
	
	public Road(int id, House house) {
		super();
		Id = id;
		this.house = house;
	}

	@Override
	public String toString() {
		return "Road [Id=" + Id + ", house=" + house + "]";
	}
	
}

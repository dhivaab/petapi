package com.blueocean.springcorelearnings.firstlesson;

public class Student {
	private int Id;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", scores=" + scores + "]";
	}
	public Score getScores() {
		return scores;
	}
	public void setScores(Score scores) {
		this.scores = scores;
	}
	private Score scores;
}

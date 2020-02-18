package com.blueocean.springcorelearnings.firstlesson;

public class Score {
	private double english;
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public double getMaths() {
		return maths;
	}
	@Override
	public String toString() {
		return "Score [english=" + english + ", maths=" + maths + ", science=" + science + "]";
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getScience() {
		return science;
	}
	public void setScience(double science) {
		this.science = science;
	}
	private double maths;
	private double science;
}

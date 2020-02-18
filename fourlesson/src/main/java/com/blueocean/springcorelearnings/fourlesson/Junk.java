package com.blueocean.springcorelearnings.fourlesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("junk")
public class Junk {
	
	@Autowired
	private Report report;

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	@Override
	public String toString() {
		return "Junk [report=" + report + "]";
	}
}

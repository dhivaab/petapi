package com.blueocean.ShoppingCart.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeNumber", unique = true, nullable = false)
	private int employeeNumber;
	@Column(name = "lastname", nullable = false)
	private String lastname;
	@Column(name = "firstname", nullable = false)
	private String firstname;
	@Column(name = "extension", nullable = false)
	private String extension;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "officecode", nullable = false)
	private String officecode;
	@Column(name = "reportsTo", nullable = true)
	private Integer reportsTo;
	@Column(name = "jobTitle", nullable = false)
	private String jobTitle;
	@Override
	
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", lastname=" + lastname + ", firstname=" + firstname
				+ ", extension=" + extension + ", email=" + email + ", officecode=" + officecode + ", reportsTo="
				+ reportsTo + ", jobTitle=" + jobTitle + "]";
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOfficecode() {
		return officecode;
	}
	public void setOfficecode(String officecode) {
		this.officecode = officecode;
	}
	public Integer getReportsTo() {
		return reportsTo;
	}
	public void setReportsTo(Integer reportsTo) {
		this.reportsTo = reportsTo;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Employee(int employeeNumber, String lastname, String firstname, String extension, String email,
			String officecode, Integer reportsTo, String jobTitle) {
		super();
		this.employeeNumber = employeeNumber;
		this.lastname = lastname;
		this.firstname = firstname;
		this.extension = extension;
		this.email = email;
		this.officecode = officecode;
		this.reportsTo = reportsTo;
		this.jobTitle = jobTitle;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

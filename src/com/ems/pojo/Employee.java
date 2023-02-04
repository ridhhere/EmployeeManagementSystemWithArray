package com.ems.pojo;

public class Employee {
	//variables
	private int eid;
	private String ename;
	private String eadd;
	private String email;
	private int salary;
	
	//Getters and Setters
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//Default Constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Constructor with Fields
	public Employee(int eid, String ename, String eadd, String email, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eadd = eadd;
		this.email = email;
		this.salary = salary;
	}
	
	
	
	
	
	
}

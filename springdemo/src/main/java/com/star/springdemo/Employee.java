package com.star.springdemo;

public class Employee {          //POJO,BEAN
	 
	private int eid;
	private String ename;
	private double salary;
	
	public Employee() {
		System.out.println("Object created");
	}
	
	
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		
		return eid;
	}
	public void setEid(int eid) {
		System.out.println("Setter method called");
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
		

}

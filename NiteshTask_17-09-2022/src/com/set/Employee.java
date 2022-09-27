package com.set;

import java.util.Objects;

public class Employee implements Comparable  
{
	
	private int eid;
	private String ename;
	private int salary;
	
	public Employee() {
		super();
	}
	
	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid && Objects.equals(ename, other.ename) && salary == other.salary;
	}

	@Override
	public int compareTo(Object o) {
		
		int eid1 = this.eid;
		int eid2 = ((Employee)o).eid;
		if(eid1<eid2) {
			return -1;
		}
		else if(eid>eid2) {
			return 1;
		}
		else return 0;
		
	}
	

}

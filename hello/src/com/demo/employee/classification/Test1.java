package com.demo.employee.classification;

class EmployeeClassificationStatic extends Object{
	private static int eid;
	private static String ename;
	private static String ebranch;
	private static int esalary;
	
	public EmployeeClassificationStatic(int eid, String ename, String ebranch, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ebranch = ebranch;
		this.esalary = esalary;
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
	
	public String getEbranch() {
		return ebranch;
	}
	
	public void setEbranch(String ebranch) {
		this.ebranch = ebranch;
	}
	
	public int getEsalary() {
		return esalary;
	}
	
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	

}

public class Test1{
	public static void main(String[] args) {
		
		EmployeeClassificationStatic emp1 = new EmployeeClassificationStatic(101, "Nitesh","Software", 60000);
		EmployeeClassificationStatic emp2 = new EmployeeClassificationStatic(102, "Sumit","IT", 20000);
		EmployeeClassificationStatic emp3 = new EmployeeClassificationStatic(103, "Snehal","Corporate", 30000);
		
		
		emp1.setEbranch("Civil");
		emp2.setEname("Hello");
		System.out.println("Using Static");
		System.out.println(emp1.getEid()+","+emp1.getEname()+","+emp1.getEbranch()+","+emp1.getEsalary());
		System.out.println(emp2.getEid()+","+emp2.getEname()+","+emp2.getEbranch()+","+emp2.getEsalary());
		System.out.println(emp3.getEid()+","+emp3.getEname()+","+emp3.getEbranch()+","+emp3.getEsalary());
		
		
		
	}
}

package com.demo.employee.classification;

class EmployeeClassification extends Object{
	private  int eid;
	private  String ename;
	private  String ebranch;
	private  int esalary;
	
	public EmployeeClassification(int eid, String ename, String ebranch, int esalary) {
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

public class Test{
	public static void main(String[] args) {
		
		EmployeeClassification emp1 = new EmployeeClassification(101, "Nitesh","Software", 60000);
		EmployeeClassification emp2 = new EmployeeClassification(102, "Sumit","IT", 20000);
		EmployeeClassification emp3 = new EmployeeClassification(103, "Snehal","Corporate", 30000);
		
		System.out.println("Before using setter");
		System.out.println(emp1.getEid()+","+emp1.getEname()+","+emp1.getEbranch()+","+emp1.getEsalary());
		System.out.println(emp2.getEid()+","+emp2.getEname()+","+emp2.getEbranch()+","+emp2.getEsalary());
		System.out.println(emp3.getEid()+","+emp3.getEname()+","+emp3.getEbranch()+","+emp3.getEsalary());
		
		
		emp1.setEbranch("Civil");
		emp2.setEname("Hello");
		System.out.println("After using setter");
		System.out.println(emp1.getEid()+","+emp1.getEname()+","+emp1.getEbranch()+","+emp1.getEsalary());
		System.out.println(emp2.getEid()+","+emp2.getEname()+","+emp2.getEbranch()+","+emp2.getEsalary());
		System.out.println(emp3.getEid()+","+emp3.getEname()+","+emp3.getEbranch()+","+emp3.getEsalary());
		
		
		
	}
}

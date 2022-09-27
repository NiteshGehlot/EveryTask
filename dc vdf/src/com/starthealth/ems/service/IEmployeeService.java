package com.starthealth.ems.service;

import java.util.List;

import com.starhealth.ems.bean.Employee;

public interface IEmployeeService {
	
	
	
	public int  addEmployee(Employee emp);
	public int  updateEmployee(Employee emp);
	
	public int deleteEmployeeById(int eid);
	public Employee  selectEmployeeById(int eid);
	
	public List<Employee>  selectAllEmployeees();
	
	

}

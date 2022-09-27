package com.starthealth.ems.service;

import java.util.List;

import com.starhealth.ems.bean.Employee;
import com.starhealth.ems.dao.EmployeeDaoImp;
import com.starhealth.ems.dao.IEmployeeDAO;

public class EmployeeServiceImp implements IEmployeeService {

	
	IEmployeeDAO  dao =	new EmployeeDaoImp();
	
	
	@Override
	public int addEmployee(Employee emp) {
		
		return  dao.addEmployee(emp);
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(emp);
	}

	@Override
	public int deleteEmployeeById(int eid) {
		
		return dao.deleteEmployeeById(eid);
	}

	@Override
	public Employee selectEmployeeById(int eid) {
		
		return dao.selectEmployeeById(eid);
	}

	@Override
	public List<Employee> selectAllEmployeees() {
		
		return dao.selectAllEmployeees();
	}

	
	
	public static boolean validateInputs(Employee emp) {

		boolean isValid = false;
	
	if (emp.getEid() > 99 && emp.getEname().length() > 3 && emp.getSalary() > 1000 && emp.getComm() > 0) {

		isValid = true;
	}
	
	return isValid;

}
	
	
	
}

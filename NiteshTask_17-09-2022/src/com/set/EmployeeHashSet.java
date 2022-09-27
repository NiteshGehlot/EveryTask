package com.set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSet {
	
	public static void main(String args[]) {
		
		Set<Employee> set = new HashSet<Employee>();
		
		set.add(new Employee(101,"ad",1000));
		set.add(new Employee(102,"er",2000));
		set.add(new Employee(103,"gd",1300));
		set.add(new Employee(104,"bn",1500));
		
		System.out.println(set);
		
	
	}

}

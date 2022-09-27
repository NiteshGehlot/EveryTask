package com.set;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return -s1.compareTo(s2);
	}

	

	

}

/*
 * public class MyComparator implements Comparator<String> {
 * 
 * @Override public int compare(String s1, String s2) {
 * 
 * return s1.compareTo(s2); //for descending order insert -(negative sign)
 * before s1 }
 * 
 * 
 * 
 * }
 */

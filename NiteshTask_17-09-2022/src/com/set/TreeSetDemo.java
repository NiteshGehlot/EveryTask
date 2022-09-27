package com.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(12);
		set.add(14);
		set.add(11);
		set.add(67);
		System.out.println("Integer");
		System.out.println(set);
		
		Set<String> set1  = new TreeSet<String>();
		set1.add("a");
		set1.add("v");
		set1.add("e");
		set1.add("w");
		System.out.println("String");
		System.out.println(set1);
		
		Set<Employee> set2 = new TreeSet<Employee>(new MyComparator());
		set2.add(new Employee(101,"q",1000));
		set2.add(new Employee(102,"f",1300));
		set2.add(new Employee(103,"a",1300));
		set2.add(new Employee(104,"b",1500));
		System.out.println("Heterogenous");
		System.out.println(set2);
		
		
		
		
		

	}

	

}

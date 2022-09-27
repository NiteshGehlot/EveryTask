package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String args[]) {
		
		Set<String> set = new LinkedHashSet<String>();
		set.add("a");
		set.add("v");
		set.add("r");
		set.add("g");
		set.add("w");   //duplicate not allowed
		set.add(null);
		
		
		System.out.println(set);
		
	}

}

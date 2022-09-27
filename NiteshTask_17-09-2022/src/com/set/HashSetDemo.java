package com.set;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(120);
		set.add(124);
		set.add(122);
		set.add(125);
		set.add(123);
		set.add(null);         //null allowed in set
		set.add(120);          //duplicate not allowed
		
		System.out.println(set); //insertion order will be based on hashcode
		

		

	}

}

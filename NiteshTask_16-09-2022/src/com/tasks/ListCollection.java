package com.tasks;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
	public static void main(String args[]) {
		
		List<Object> list = new ArrayList<Object>();
		
		list.add("Nitesh");
		list.add(4.55);
		list.add("JAVA");
		list.add(new ListCollection());
		list.add("Nitesh");
		list.add(null);
		
		System.out.println(list);
		
		
		

	}

}

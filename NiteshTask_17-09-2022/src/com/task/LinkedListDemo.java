package com.task;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		
		list.add(101);
		list.add(105);
		list.add(103);
		list.add(106);
		list.add(102);
		
		list.add(3, 107);
		list.remove(2);

		System.out.println(list);
		
		System.out.println("Foreach method");
		for (Integer data : list) {
			System.out.println(data);	
		}
		
		System.out.println("Iterator method");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.println(i);
		}
		
		System.out.println("List Iterator method");
		ListIterator<Integer> lit = list.listIterator();
		while(lit.hasNext()) {
			Integer i = lit.next();
			System.out.println(i);
			}
		System.out.println("List Iterator previous method");
		while(lit.hasPrevious()) {
			Integer i = lit.previous();
			System.out.println(i);
		}

	}

}

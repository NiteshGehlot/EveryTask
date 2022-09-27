package com.library;

public class Main {
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee(101,"Snehal",400);
		System.out.println(e1);
		
		Employee e2 = new Employee(102,"nitesh",800);
		System.out.println(e2);
		
		System.out.println(e1==e2); 
		
		System.out.println(e1.equals(e2));    
		
   
		
		
		System.out.println(e1.hashCode());  
		System.out.println(e2.hashCode());
	}

}
	
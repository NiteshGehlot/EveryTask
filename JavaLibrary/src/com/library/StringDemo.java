package com.library;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Snehal";  
		String s2 = "Snehal";  
		String s3 = new String("Snehal"); 
		String s4 = new String("Snehal");	
		System.out.println(s1);
		System.out.println(s2);
		
		s2 = s2.concat("Kathale");
		System.out.println(s2);
		
		String str1 = new String("A");
		String str2 = new String("A");
		
		System.out.println(str1.compareTo(str2));
		
		StringBuffer sb1 = new StringBuffer("Snehal");
		sb1.append("Kathale");
		System.out.println(sb1.reverse());
		System.out.println(sb1);
		
		System.out.println(sb1.replace(0, 1, "j"));
		
		
	}

}

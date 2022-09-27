package com.java8;


               //recommended to use to avoid ambiguity not mandatory
public interface MyInterface {

	public abstract int add(int a,int b);
	
	public static void m1() {
		System.out.println("This is static method in interface");
	}
	
	public default void m2() {
		System.out.println("This is default method in interface");
	}
	

	
	
}

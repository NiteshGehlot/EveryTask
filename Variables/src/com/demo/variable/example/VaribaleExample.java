package com.demo.variable.example;

public class VaribaleExample {
	
	String nameInstance;                 //intance variable
	int rollNoInstance;
	boolean behaviorInstance;
	
	
	static String nameStatic;          //static variable
	static int rollNoStatic;
	static boolean behaviorStatic;

	public static void main(String[] args) {
		String nameLocal= "Nitesh";
		int rollNoLocal = 29;
		boolean behaviourLocal = true;
		
		System.out.println("Local Variable");
		System.out.println(nameLocal+","+rollNoLocal+","+behaviourLocal);
		
		
		VaribaleExample var = new VaribaleExample();
		var.nameInstance = "Sumit";
		var.rollNoInstance = 12;
		var.behaviorInstance=false;
		
		System.out.println("Instance Variable");
		System.out.println(var.nameInstance+","+var.rollNoInstance+","+var.behaviorInstance);
		
		
		System.out.println("Static Variable");
		System.out.println(nameStatic+","+rollNoStatic+","+behaviorStatic);

	}

}

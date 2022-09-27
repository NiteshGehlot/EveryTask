package com.task.polymorphism;

public class Lion extends Animal {

	public void eat() {
		System.out.println("eating flesh");

	}

	@Override
	public void display() {
		System.out.println("Lion class prints display method by override");
	}

	
	//example of overloading
	public static void sum() {
		System.out.println("default method");
	}

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
//		method overloading
		sum(2, 3);
		sum(2, 3, 3);

	}

}

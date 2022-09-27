package com.task.polymorphism;

public class Monkey {
	public void eat() {
		System.out.println("eating banana");
	}

	public static void main(String[] args) {

		Animal obj1 = new Lion();
		obj1.display();

		Animal obj2 = new Animal();
		obj2.display();
	}

}

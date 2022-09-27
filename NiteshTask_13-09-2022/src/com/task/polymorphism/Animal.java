package com.task.polymorphism;

public class Animal {

	public void eat() {
		System.out.println("Eating");
	}

	public void display() {
		System.out.println("Animal class prints display method");
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		Animal a1 = new Lion();
		a1.eat();
	}

}

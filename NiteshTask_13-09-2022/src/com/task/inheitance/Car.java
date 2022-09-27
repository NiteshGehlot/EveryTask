package com.task.inheitance;

public class Car extends Vehicle {
	public static void main(String[] args) {

		Vehicle veh1 = new Vehicle();
		veh1.type();
		System.out.println("parent to parent access to properties" + veh1.toString());

		Car c1 = new Car();
		c1.display();
		c1.type();

		System.out.println("called toString method only :  " + c1);

	}

	public void display() {
		System.out.println("dispaly method inheritance by Vehicle Class");
	}

}

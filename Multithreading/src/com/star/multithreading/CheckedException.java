package com.star.multithreading;

public class CheckedException {
	public static void main(String args[]) {
		
		System.out.println("Hello");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thank you");
	}

}

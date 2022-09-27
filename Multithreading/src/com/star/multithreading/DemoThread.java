package com.star.multithreading;

public class DemoThread extends Thread{
	
	public static void main(String args[]) {             //main thread
		
		
		
		DemoThread t1 = new DemoThread();
		
		System.out.println(t1);
		
		t1.setName("child");
		//t1.setPriority(Thread.MAX_PRIORITY-1);       //or directly use 9
		System.out.println(t1);
		t1.start();                 //t1.run() is internally called by the thread
		
		/*
		 * for(int i=0;i<5;i++) { System.out.println("Welcome to main"); }
		 */
		
		
		DemoThread t2 = new DemoThread();
		t2.setName("child2");
		t2.start();
		
		
		
	}
	
	@Override
	public void run() {
		
		Thread.yield();
		for(int i=0;i<5;i++) {
		System.out.println("welcome to "+Thread.currentThread().getName());
		}
	}

}

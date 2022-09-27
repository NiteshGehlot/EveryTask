package com.tasks;


public class ThreadJSY extends Thread {

	public static void main(String[] args) {

		ThreadJSY t1 = new ThreadJSY();
		System.out.println(t1);

		t1.setName("child1");
		System.out.println(t1);
		t1.start();  
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ThreadJSY t2 = new ThreadJSY();
		t2.setName("child2");
		t2.start();
		
		Thread t3 = new ThreadJSY();
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		
		Thread.yield();
		for(int i=0;i<5;i++) {
		System.out.println("welcome to "+Thread.currentThread().getName());
		}
	}
}

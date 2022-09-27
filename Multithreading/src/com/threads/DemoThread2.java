package com.threads;

import com.star.multithreading.DemoThread;

public class DemoThread2 implements Runnable {

	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}

	public static void main(String args[]) {

		// DemoThread2 t1 = new DemoThread2(); //one method

		Runnable r1 = new DemoThread(); // recommended method

		Thread t = new Thread(r1);

		t.setName("Nitesh");
		System.out.println(t.isAlive());
		//t.setPriority(Thread.MAX_PRIORITY - 5);
		
		Thread t3 = new Thread(r1);

		t3.setName("Sumit");
		
		t3.start();
		t.start();
		
		System.out.println(t3.isAlive());

	}

}

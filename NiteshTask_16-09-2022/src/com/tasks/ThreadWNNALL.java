package com.tasks;

class Call extends Thread{
	int total  = 0;
	
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("child thread starts calcuation");// step-2
			for (int i = 0; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("child thread giving notification call");// step-3
			this.notify();
		}
	}
}

public class ThreadWNNALL {
	
	public static void main(String args[]) {
		
		Call c1 = new Call();
		c1.start();
		synchronized (c1) {
			System.out.println("main Thread calling wait() method");// step-1
			try {
				c1.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main Thread got notification call");// step-4
			System.out.println(c1.total);
		}
		
	}

}

package com.synchronization;

public class Admission implements Runnable{
	
	static int seats = 1;

	public static void main(String[] args) {
		
		Admission admission = new Admission();
		
		Thread t1 = new Thread(admission,"Nitesh");      //default priority is 5
		
		Thread t2 = new Thread(admission);
		t2.setName("Sumit");
		
		System.out.println("**********Welcome to Counselling center**********");
		System.out.println("No .of seats available before :-"+seats);
		
		t1.start();
		t2.start();

	}

	@Override
		public synchronized void run() {      //this method can be used to synchronize whole method
			
		//	synchronized (this) {      //this method can be used to synchronize some lines of code       
				
				//this keyword refers to current class object
			if(seats>0) {
			System.out.println("Seat allocated to "+Thread.currentThread().getName());
			seats = seats-1;
			}
		//	}
	
			System.out.println("No. of seats left : "+seats);
		}

}

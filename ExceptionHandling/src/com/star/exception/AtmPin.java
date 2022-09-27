package com.star.exception;

import java.util.Scanner;

public class AtmPin{

	public static void main(String[] args) {
		
		int accounts[] = {101,102,103,104,105};     
		
		int pin[] = {123,456,789,1234,1467};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*******Welcome To ATM *********");
		System.out.println("Enter 1)Account number ");
		int atmaccn = sc.nextInt();
		System.out.println("Enter 2)Atm Pin ");
		int atmpin = sc.nextInt();
		int len = accounts.length;
		for(int i=0;i<len;i++) {
			
			if((atmaccn == accounts[i]) && (atmpin == pin[i])) {
				System.out.println("Congratulations");
				break;
			}
			else {
				try {
					throw new WrongPinException("Sorry wrong pin");
				}catch(WrongPinException e) {
					System.err.println(e);
					System.err.println("Enter right pin");
				}
			}
			
		}
	}
}











//array creating method
//
//String names[] = {"Adam","Smith","Tom","Jerry","Ford"};
//
//double balance[] = {500.0,6000.0,12000.0,15000.0,21000.0};
//int ar[] , x;
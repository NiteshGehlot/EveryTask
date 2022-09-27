package com.keyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingKBData {

	public static void main(String[] args) {

		//System.out.println("Hello");

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
//			int n = br.read();
//			System.out.println((char)n);
			System.out.println("Enter name");
			String s1  = br.readLine();
			System.out.println(s1);
			System.out.println("Enter salary");
			String s2 = br.readLine();
			int sal = Integer.parseInt(s2);
			System.out.println(sal);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

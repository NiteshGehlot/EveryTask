package com.keyboard;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("Input.txt");
			
			FileWriter writer = new FileWriter("output.txt");
			
			//int n = reader.read();
			//System.out.println((char)n);
			int j=0;
			while((j= reader.read()) != -1) {
				
				writer.write(j);
				System.out.print((char)j);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}

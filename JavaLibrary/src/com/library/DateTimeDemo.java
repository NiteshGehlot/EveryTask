package com.library;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
	public static void main(String args[]) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println("year "+date.getYear());
		System.out.println("month "+date.getMonth());
		System.out.println("week Day "+date.getDayOfWeek());
		
		System.out.println(date.minusMonths(1));         //exact one month
		System.out.println(date.plusMonths(1));
		System.out.println(date.plusWeeks(6));
		
		String str = "2022/05/15";
		DateTimeFormatter formatter	= DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date3 = LocalDate.parse(str,formatter);
		
		LocalDate date2 = LocalDate.of(1947, 8, 15);
		System.out.println(date2.getDayOfWeek());
		
		
	}

}

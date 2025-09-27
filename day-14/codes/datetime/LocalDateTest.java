package com.spg.java.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate ldt = LocalDate.now();
		System.out.println(ldt);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String today = formatter.format(ldt);
		System.out.println(today);

		LocalDate ld = LocalDate.of(2024, 12, 31); // year, month, day of month
		System.out.println(ld);

		//ld = LocalDate.of(2024, 12, 32); // java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 -
											// 28/31): 32

		// in prior version of Java
		java.util.Date d = new java.util.Date();
		System.out.println(d);
		System.out.println("month = " + d.getMonth()); //month is ranging from 0 - 11 in java.util.Date 
	}

}

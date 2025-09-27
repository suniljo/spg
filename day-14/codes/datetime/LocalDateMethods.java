package com.spg.java.datetime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateMethods {

	public static void main(String[] args) {
		LocalDate dt = LocalDate.now();
		
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getMonthValue());
		System.out.println(dt.getMonth());//SEPTEMBER
		System.out.println(dt.getYear());
		System.out.println(dt.getDayOfYear());		
		
		//printing current month name
		Month month = dt.getMonth();
		System.out.println("current month = " + month); //SEPTEMBER
		System.out.println(month.getValue()); //9
		//practice rest of the methods

	}

}

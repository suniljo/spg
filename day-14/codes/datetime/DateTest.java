package com.spg.java.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		//SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String formattedDate = formatter.format(d);
		System.out.println(formattedDate);
		System.out.println();
		
		Date date1=null;
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Enter check-in date (dd/MM/yyyy):");
        String cinput = input.nextLine();
        
        if(null != cinput && cinput.trim().length() > 0){
             date1 = format.parse(cinput);
        }
        
        System.out.print(format.format(date1)); 

	}

}

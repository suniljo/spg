package com.spg.java.except;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("enter first no: ");
			int x = sc.nextInt();
			
			System.out.print("enter second no: ");
			int y = sc.nextInt();
			
			int z = x / y;
			
			System.out.println(String.format("%d / %d = %d \n" , x, y, z));
		}catch(ArithmeticException ex) {
			System.err.println("catch block");
			System.err.println(ex.toString());
			System.out.println();
		}
		finally {
			System.out.println("--- finally block ---");
			System.out.println("application designed & developed by");
			System.out.println("team @ S & P Global");
			sc.close();
		}
		
		System.out.println("---- done ----");
	}
}

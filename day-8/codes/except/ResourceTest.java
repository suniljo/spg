package com.spg.java.except;

import java.util.Scanner;

public class ResourceTest {

	public static void main(String[] args) {
	
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("enter first no: ");
			int x = sc.nextInt();
			
			System.out.print("enter second no: ");
			int y = sc.nextInt();
			
			int z = x / y;
			
			System.out.println(String.format("%d / %d = %d \n" , x, y, z));
		}
		
		System.out.println("---- done ----");
	}
}


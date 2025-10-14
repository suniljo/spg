package com.spg.java.loops;

import java.util.Scanner;

public class MTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which numbers multiplication table? ");
		int num = sc.nextInt();
		
		printTable(num);
		
		sc.close();

	}

	private static void printTable(int num) {
		for(int i=1; i<=10; i++) {
			int p = num * i;
			System.out.printf("%2d x %2d = %3d \n", num, i, p);
		}
		
	}

}

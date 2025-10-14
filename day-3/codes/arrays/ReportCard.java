package com.spg.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReportCard {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("enter student name: ");
		String name = sc.nextLine();
		
		System.out.print("enter number of subjects: ");
		int numSub = sc.nextInt();
		
		int[] marks = new int[numSub];
		
		marksEntry(marks);
		System.out.println(Arrays.toString(marks));
		
		printReportCard(name, marks);
	}


	private static void marksEntry(int[] marks) {
		for(int i=0; i<marks.length; i++) {
			System.out.print("enter mark for Subject-"+ (i+1) + ": ");
			marks[i] = sc.nextInt();
		}		
	}

	private static void printReportCard(String name, int[] marks) {
		System.out.println();
		System.out.println("-".repeat(50));
		System.out.println("\t\tREPORT CARD");
		System.out.println("NAME: " + name);
		System.out.println("-".repeat(50));
		
		System.out.println(" SUBJECT \t MARK");
		System.out.println("-".repeat(50));
		
		int total = 0;
		for(int i=0; i<marks.length; i++) {
			total += marks[i];
			System.out.println("Subject-"+(i+1)+"\t   " + marks[i]);
		}
		System.out.println("-".repeat(50));
		
		float avg = (float)total / marks.length;
		System.out.printf("TOTAL: %d    AVERAGE: %.2f\n", total, avg);
		System.out.println("-".repeat(50));
	}	
}

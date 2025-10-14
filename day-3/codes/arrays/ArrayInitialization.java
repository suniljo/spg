package com.spg.java.arrays;

import java.util.Arrays;

public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {84, 79, 65, 80, 99, 73, 81};
		arrayOperations(marks);
	}

	private static void arrayOperations(int[] marks) {
		System.out.println(marks);
		System.out.println("no of subjects = " + marks.length);
		
		System.out.println(Arrays.toString(marks));
		System.out.println("-".repeat(100));
		
		//--array iteration using for loop
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for subject-" + (i+1)+" = " + marks[i]);
		}
		System.out.println("-".repeat(100));
		
		//--array iteration using enhanced for loop/ for..each loop
		for(int mark : marks) {
			System.out.print(mark + " | ");
		}
		System.out.println();
		
		System.out.println(marks[6]);
		System.out.println(marks[7]); //java.lang.ArrayIndexOutofBoundsException
	}

}

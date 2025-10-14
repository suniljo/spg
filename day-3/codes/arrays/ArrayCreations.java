package com.spg.java.arrays;

import java.util.Arrays;

public class ArrayCreations {

	public static void main(String[] args) {
		int[] marks = new int[10];
		marks[0] = 98;
		marks[1] = 92;
		System.out.println("size of array = " + marks.length);
		System.out.println(Arrays.toString(marks));
		
		float []salaries = new float[8];
		System.out.println(Arrays.toString(salaries));
		
		boolean status[] = new boolean[10];
		System.out.println(Arrays.toString(status));
		
		String[] names = new String[10];
		for(String name : names) {
			System.out.print(name + ", ");
		}
	}

}

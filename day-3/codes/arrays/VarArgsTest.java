package com.spg.java.arrays;

import java.util.Arrays;

public class VarArgsTest {

	public static void main(String[] args) {
		findLargest(10, 20);		
		findLargest(10, 20, 30);
		findLargest(25, 85, 29, 12);
	}
	
	private static void findLargest(int... data) {
		int lar = data[0];
		for(int x : data) {
			if(x > lar) {
				lar = x;
			}
		}
		System.out.println("largest of " + Arrays.toString(data) + " =  " + lar);
	}
}

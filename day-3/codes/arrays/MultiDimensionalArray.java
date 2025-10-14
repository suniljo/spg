package com.spg.java.arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] n = new int[5][4];
		
		System.out.println("array size = " + n.length);
		
		for(int i=0; i<n.length; i++) {
			System.out.println("size of n["+i+"] = " + n[i].length);
		}
		System.out.println();
		
		//-- array iteration using for loop
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j] + "      ");
			}
			System.out.println();
		}
		System.out.println();
		
		//-- array iteration using enhanced for loop
		for(int[] x : n) {
			for(int y : x) {
				System.out.print(y + "      ");
			}
			System.out.println();
		}
	}

}

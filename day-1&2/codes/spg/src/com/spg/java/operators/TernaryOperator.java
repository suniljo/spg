package com.spg.java.operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		
		int lar = (x > y) ? x : y;
		System.out.println(lar);
		
		lar = (x > y) ? (x > z) ? x : z : (y > z) ? y : z;
		System.out.println(lar);
	}

}

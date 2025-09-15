package com.spg.java.except;

public class ThrowTest {
	
	private int calculate(int a, int b) {
		if(b == 0) {
			//throw new RuntimeException();
			throw new RuntimeException("cannot divide an integer by 0");
		}
		return a / b;
	}
	
	public static void main(String[] args) {
		ThrowTest obj = new ThrowTest();
		try {
			//int res = obj.calculate(10, 5);
			int res = obj.calculate(10, 0);
			
			System.out.println("result = " + res);
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
			System.err.println(ex.toString());
		}
		System.out.println("--- done ---");
	}

}

package com.spg.java.oops;

public class StaticBlockTest {
	static final int n; //static blank final variable
	
	static{
		System.out.println("static block-1");
		n = 12;
	}
	
	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println("main ends");
	}

	static{
		System.out.println("static block-2");
	}	
}

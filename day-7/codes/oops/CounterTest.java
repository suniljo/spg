package com.spg.java.oops;

public class CounterTest {
	//int n = 10; //instance variable
	static int n = 10; //class variable
	
	void inc() {
		n++;
	}
	
	public static void main(String[] args) {
		CounterTest obj1 = new CounterTest();
		CounterTest obj2 = new CounterTest();
		CounterTest obj3 = new CounterTest();
		
		obj1.inc();
		obj2.inc();
		obj3.inc();
		
		System.out.println(obj1.n);
		System.out.println(obj2.n);
		System.out.println(obj3.n);
		System.out.println(CounterTest.n);
	}
}

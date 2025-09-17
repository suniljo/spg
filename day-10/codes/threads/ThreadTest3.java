package com.spg.java.threads;

class Naturals extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + " = " + i);
		}
	}
}

class Evens extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + " = " + (i*2));
		}
	}
}

public class ThreadTest3 {

	public static void main(String[] args) {
		Naturals nat = new Naturals();
		Evens eve = new Evens();
		
		nat.setName("NATURAL");
		eve.setName("EVEN   ");
		
		nat.start();
		eve.start();
		
		System.out.println("Done");
	}

}

package com.spg.java.threads;

public class MainTheadTest {

	public static void main(String[] args) {
		int noOfThreads = Thread.activeCount();
		System.out.println("active count of threads = " + noOfThreads);
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("id = " + t.getId());
		System.out.println("name = " + t.getName());
		System.out.println("priority = " + t.getPriority());
		System.out.println(t.getThreadGroup());
		
		t.setName("spg");
		//t.setPriority(10);
		t.setPriority(11); //java.lang.IllegalArgumentException
		System.out.println(t);
	}

}

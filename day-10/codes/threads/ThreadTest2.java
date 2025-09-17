package com.spg.java.threads;

class MyTask2 extends Thread {

	@Override
	public void run() {
		System.out.println("run() thread --> " + Thread.currentThread().getName());		
	}
	
}

public class ThreadTest2 {

	public static void main(String[] args) {
		System.out.println("no of active threads = " + Thread.activeCount());
				
		Thread t = Thread.currentThread();
		System.out.println("main() thread --> " + t.getName());
		
		Thread ct = new MyTask2();
		ct.start();
		
		System.out.println("no of active threads = " + Thread.activeCount());
	}

}

package com.spg.java.threads;

class MyTask1 implements Runnable{

	@Override
	public void run() {
		System.out.println("run() thread --> " + Thread.currentThread().getName());		
	}
	
}

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("no of active threads = " + Thread.activeCount());
				
		Thread t = Thread.currentThread();
		System.out.println("main() thread --> " + t.getName());
		
		Runnable task1 = new MyTask1();
		Thread ct = new Thread(task1);
		ct.start();
		
		System.out.println("no of active threads = " + Thread.activeCount());
		
		var n = 10;
		System.out.println(n);
	}

}

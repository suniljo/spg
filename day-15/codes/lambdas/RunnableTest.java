package com.spg.java.lambdas;

public class RunnableTest {
	public static void main(String[] args) {
		/*
		 * Runnable runRef = new Runnable() { 
		 * 		public void run() { 
		 * 			for(int i=1; i<=5; i++) { 
		 * 				System.out.println(Thread.currentThread().getName() + " - " + i); 
		 * 				try { 
		 * 		 		 	Thread.sleep(1000); 
		 * 				}catch(Exception ex) {} 
		 * 			} 
		 * 		} 
		 * };
		 */

		Thread t = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " - " + i);
				try {
					Thread.sleep(1000);
				} catch (Exception ex) {
				}
			}
		});
		
		t.start();
	}
}

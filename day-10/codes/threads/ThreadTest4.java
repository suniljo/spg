package com.spg.java.threads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

class Naturals1 extends Thread{
	private File dir;
	private String fileName;
	
	public Naturals1(File dir, String fileName) {
		super();
		this.dir = dir;
		this.fileName = fileName;
	}
	public void run() {
		writeData();
	}
	public void writeData() {
		try (Writer fout = new FileWriter(new File(dir, fileName))){
			for(int i=1; i<=10; i++) {
				fout.write(Thread.currentThread().getName()+" - " + i + "\n");
				Thread.sleep(1000);
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Evens1 extends Thread{
	private File dir;
	private String fileName;
	
	public Evens1(File dir, String fileName) {
		super();
		this.dir = dir;
		this.fileName = fileName;
	}
	public void run() {
		writeData();
	}
	
	public void writeData() {
		
		try (Writer fout = new FileWriter(new File(dir, fileName))){
			for(int i=1; i<=10; i++) {
				fout.write(Thread.currentThread().getName()+" - " + (i*2) + "\n");
				Thread.sleep(1000);
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadTest4 {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\Sunil Joseph\\Desktop\\normal");
		long startTime = System.currentTimeMillis();
		System.out.println("start time = " + startTime);
		
		Thread nat = new Naturals1(dir, "naturals.txt");
		Thread eve = new Evens1(dir, "evens.txt");
		
		nat.setName("NATURAL");
		eve.setName("EVEN   ");
	
		nat.start();
		eve.start();
		try {
			nat.join();
			eve.join();
		}catch(Exception ex) {
			ex.printStackTrace();
		}


		long endTime = System.currentTimeMillis();	
		System.out.println("end time = " + endTime);
		
		System.out.println("execution time = " + (endTime - startTime));
	}

}


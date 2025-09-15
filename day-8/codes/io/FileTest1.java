package com.spg.java.io;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) throws IOException {
		/*
		File dir = new File("c:/S&P/java");
		if(!dir.exists()) {
			boolean dirCreationStatus = dir.mkdir();
			System.out.println("directory created = " + dirCreationStatus);
		}
		*/
	
		File dir = new File("c:/S&P/java/io/file");
		if(!dir.exists()) {
			boolean dirCreationStatus = dir.mkdirs();
			System.out.println("directory created = " + dirCreationStatus);
		}
		
		File f = new File(dir, "test.txt");
		if(!f.exists()) {
			System.out.println(f.createNewFile());
		}
	
	}

}

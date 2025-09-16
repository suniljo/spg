package com.spg.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		InputStream fin = new FileInputStream("src/com/spg/java/io/java.txt");
		
		/*
		int noOfBytesToRead = fin.available();
		System.out.println("no of characters to be read = " + noOfBytesToRead);
		System.out.println(fin.read());
		System.out.println(fin.read());
		System.out.println("no of characters to be read = " + fin.available());
		*/
		
		/*
		//-- read file contents character-by-character
		int n;
		while((n = fin.read()) != -1) {
			System.out.print((char)n);
			Thread.sleep(200); //200ms
		}
		*/
		
		/*
		//--read file contents as a whole
		byte[] b = new byte[fin.available()];
		fin.read(b);
		String str = new String(b);
		System.out.println(str);
		*/
		
		//--read file contents line-by-line
		Reader fileReader = new InputStreamReader(fin); //to convert a byte-stream to character-stream
		BufferedReader br = new BufferedReader(fileReader);
		String str = br.readLine();
		while(str != null) {
			System.out.println(str);
			str = br.readLine();
			Thread.sleep(2000);
		}
		fin.close();
		br.close();
	}

}

package com.spg.java.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		//FileOutputStream fout = new FileOutputStream("src/com/spg/java/io/spg.txt");
		FileOutputStream fout = new FileOutputStream("src/com/spg/java/io/spg.txt", true); //true - appending mode
		
		String str = "We provide Essential Intelligence: a combination of the right data, connected technologies and experts to enable our customers to make decisions with\n\n";
		byte[] b = str.getBytes();
		
		fout.write(b);
		System.out.println("file saved");
		fout.close();
	}

}

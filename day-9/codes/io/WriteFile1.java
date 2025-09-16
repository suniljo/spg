package com.spg.java.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile1 {

	public static void main(String[] args) throws Exception {
		//FileWriter fout = new FileWriter("src/com/spg/java/io/spg.txt");
		FileWriter fout = new FileWriter("src/com/spg/java/io/spg.txt", true); //true - appending mode
		
		String str = "We provide Essential Intelligence: a combination of the right data, connected technologies and experts to enable our customers to make decisions with\n\n";
			
		fout.write(str);
		
		System.out.println("file saved");
		fout.close();

	}

}

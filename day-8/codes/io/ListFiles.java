package com.spg.java.io;

import java.io.File;

public class ListFiles {

	public static void main(String[] args) {
		File dir = new File("C:/S&P");
		
		if(dir.isDirectory()) {
			String[] files = dir.list();
			for(int i=0; i<files.length; i++) {
				System.out.println((i+1)+". " + files[i]);
			}
		}
	}

}

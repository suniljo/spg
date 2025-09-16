package com.spg.java.io;

import java.io.File;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		//File fileRef = new File("C:\\S&P\\Welcome.java");
		File fileRef = new File("src/Welcome.java");
		
		
		System.out.println("is file exists = " + fileRef.exists());
		
		if(fileRef.exists()) {
			System.out.println("is File = " + fileRef.isFile());
			System.out.println("is Directory = " + fileRef.isDirectory());
			System.out.println("name = " + fileRef.getName());
			System.out.println("path = " + fileRef.getPath());
			System.out.println("is absolute path = " + fileRef.isAbsolute());
			System.out.println("absolute path = " + fileRef.getAbsolutePath());
			
			System.out.println("is Hidden = " + fileRef.isHidden());
			System.out.println("is Writable = " + fileRef.canWrite());
			System.out.println("is Readable = " + fileRef.canRead());
			
			System.out.println("file size = " + fileRef.length());
			
			long lastModified = fileRef.lastModified();
			Date modifiedDate = new Date(lastModified);
			System.out.println("Welcome.java is modifed on " + modifiedDate);
		}
	}

}

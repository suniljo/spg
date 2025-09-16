package com.spg.java.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {

	public static void main(String[] args) throws Exception {
		Product prod = new Product(1001, "Mobile", 45750.75f);
		
		FileOutputStream fout = new FileOutputStream("src/com/spg/java/io/products.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		
		oos.writeObject(prod);
		System.out.println("saved object to file");
		oos.close();
	}
}
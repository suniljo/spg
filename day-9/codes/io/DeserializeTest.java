package com.spg.java.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeTest {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("src/com/spg/java/io/products.ser");
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		Object obj = oin.readObject();
		if(obj instanceof Product) {
			Product prod = (Product)obj;
			System.out.println(prod);
		}
	}

}

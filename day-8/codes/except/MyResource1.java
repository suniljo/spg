package com.spg.java.except;

import java.io.Closeable;
import java.io.IOException;

public class MyResource1 implements Closeable {

	public MyResource1() {
		System.out.println("MyResource1 :: Constructor");
	}
	
	public void logic() {
		System.out.println("MyResource1 :: Business Logic");
	}
	@Override
	public void close() throws IOException {
		System.out.println("MyResource1 ::  close()");
	}

}

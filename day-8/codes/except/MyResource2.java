package com.spg.java.except;

import java.io.IOException;

public class MyResource2 implements AutoCloseable {
	
	public MyResource2() {
		System.out.println("MyResource2 :: Constructor");
	}

	public void logic() {
		System.out.println("MyResource2 :: Business Logic");
	}

	@Override
	public void close() throws IOException {
		System.out.println("MyResource2 ::  close()");
	}

}

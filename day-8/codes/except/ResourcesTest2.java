package com.spg.java.except;

import java.io.IOException;

public class ResourcesTest2 {

	public static void main(String[] args) throws IOException {
		try(MyResource1 res1 = new MyResource1(); MyResource2 res2 = new MyResource2()){
			res1.logic();
			res2.logic();
		}
	}

}

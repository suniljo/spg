package com.spg.java.except;

import java.io.IOException;

public class ResourcesTest1 {

	public static void main(String[] args) throws IOException {
		MyResource1 res1 = new MyResource1(); 
		MyResource2 res2 = new MyResource2();
		
		try(res1; res2){
			res1.logic();
			res2.logic();
		}
	}

}

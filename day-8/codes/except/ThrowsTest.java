package com.spg.java.except;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserServices usrServices = new UserServices();

		int id = 101;
		
		try {
			String userName = usrServices.findUserNameById(id);
			System.out.println("Hello " + userName);
		}catch(SQLException | IOException ex) {			
			System.out.println(ex.toString());
		}
		System.out.println();
		
		System.out.println("Please wait for 5 seconds");
		Thread.sleep(5000);
		System.out.println("Thanks for waiting!!!");
	}

}

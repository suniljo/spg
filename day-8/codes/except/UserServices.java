package com.spg.java.except;

import java.io.IOException;
import java.sql.SQLException;

public class UserServices {
	
	public String findUserNameById(int uid) throws SQLException, IOException {
		if(uid == 101)
			return "Sanjay";
		return "Guest";
	}
	
}

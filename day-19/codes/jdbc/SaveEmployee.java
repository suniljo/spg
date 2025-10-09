package com.spg.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		String sql = "insert into emp values (101, 'Sanjay', 2500)";
		
		try {
			int rowsAffected = st.executeUpdate(sql);
			System.out.println("employee saved");
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
		
		st.close();
		con.close();
	}

}

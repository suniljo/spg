package com.spg.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployees {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		String sql = "insert into emp(empno, ename, sal) values (102, 'Praveen', 3500), (103, 'Jeevan', 4500),"
				+ "(104, 'Mohammed', 5500.50), (105, 'Vinod', 6500), (106, 'Varalakshmi', 7500)";
		
		try {
			int rowsAffected = st.executeUpdate(sql);
			System.out.println("no of employees saved = " + rowsAffected);
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
		
		st.close();
		con.close();

	}

}

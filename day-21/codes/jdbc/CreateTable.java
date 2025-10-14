package com.spg.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//-- initialize MySQL JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-- connect to db_spg database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_spg", "root", "root");
		
		//-- create an object for passing SQL query
		Statement st = con.createStatement();
		
		//-- pass the SQL query to create emp table
		String sql = "create table emp(empno int(5), ename varchar(50), sal float(10,2), primary key(empno))";
		try {
			st.execute(sql);
			System.out.println("Database table \"emp\" created!!");
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
		
		//-- close the connection with database
		st.close();
		con.close();
	}

}

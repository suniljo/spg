package com.spg.java.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class DBMetaData {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		DatabaseMetaData dbmd = con.getMetaData();
		
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDatabaseProductVersion());
		
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getDriverVersion());
		
		System.out.println(dbmd.getSQLKeywords());
		System.out.println();
		
		System.out.println(dbmd.getStringFunctions());
		System.out.println();
		System.out.println(dbmd.getTimeDateFunctions());
	}

}

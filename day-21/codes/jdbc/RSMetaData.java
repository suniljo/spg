package com.spg.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class RSMetaData {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		String sql = "select * from emp";		
		ResultSet rs = st.executeQuery(sql);
			
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("no of columns = " + rsmd.getColumnCount());
		
		for(int i=1; i<=rsmd.getColumnCount(); i++) {
			String columnName = rsmd.getColumnName(i);
			int colType = rsmd.getColumnType(i);
			String colTypeName = rsmd.getColumnTypeName(i);
			int colSize = rsmd.getColumnDisplaySize(i);
			String colJavaClassName = rsmd.getColumnClassName(i);
			
			System.out.println(String.format("%-10s   %-3d  %-10s  %-2d  %-20s", columnName, colType, colTypeName, colSize, colJavaClassName));
			Thread.sleep(2000);
		}
		
		rs.close();
		st.close();
		con.close();
	}
}

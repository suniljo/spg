package com.spg.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		st.addBatch("insert into emp values(101, 'Employee-1', 2500)");
		st.addBatch("insert into emp values(102, 'Employee-2', 3500)");
		//st.addBatch("insert into emp values(101, 'Employee-3', 4500)");
		st.addBatch("insert into emp values(103, 'Employee-3', 4500)");
		st.addBatch("update emp set sal = 5000");
		
		con.setAutoCommit(false);
		
		try {
			int[] rowsAffected = st.executeBatch();
			for(int x : rowsAffected) {
				System.out.println("rows affected = " + x);
			}
			con.commit();
		} catch (Exception ex) {
			System.err.println(ex);
			con.rollback();
		}
		
		st.close();
		con.close();
	}

}

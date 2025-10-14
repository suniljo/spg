/*
 * CachedRowSet - a dis-connceted rowset
 */
package com.spg.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetTest {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		String sql = "select * from emp";
		
		ResultSet rs = st.executeQuery(sql);
		
		RowSetFactory factory = RowSetProvider.newFactory();
		CachedRowSet cachedRs = factory.createCachedRowSet();
		
		cachedRs.populate(rs);
		
		con.close();   ///*******
		
        while (cachedRs.next()) {
        	int eno = cachedRs.getInt(1);
        	String name = cachedRs.getString(2);
        	float sal = cachedRs.getFloat(3); 
            
        	String emp = String.format("%-5d   %-20s     %.2f", eno, name, sal);
			System.out.println(emp);
			
			Thread.sleep(2000);
        }
        System.out.println();
        
        while (cachedRs.previous()) {
        	int eno = cachedRs.getInt(1);
        	String name = cachedRs.getString(2);
        	float sal = cachedRs.getFloat(3); 
            
        	String emp = String.format("%-5d   %-20s     %.2f", eno, name, sal);
			System.out.println(emp);
			
			Thread.sleep(2000);
        }        
        System.out.println();
       
        cachedRs.close();
	}

}

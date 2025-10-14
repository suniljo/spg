/*
 * In JDBC, a RowSet is an interface that extends the ResultSet interface, 
 * providing a more flexible and powerful way to handle tabular data.
 * Connected RowSets (e.g., JdbcRowSet) - Maintain a continuous connection to the database, similar to a ResultSet
 * Disconnected RowSets (e.g., CachedRowSet, WebRowSet)
 */
package com.spg.java.jdbc;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetTest {

	public static void main(String[] args) {
	 try {	
		JdbcRowSet jdbcRs = RowSetProvider.newFactory().createJdbcRowSet();
		
        jdbcRs.setUrl("jdbc:mysql://localhost:3306/db_spg");
        jdbcRs.setUsername("root");
        jdbcRs.setPassword("root");

        jdbcRs.setCommand("SELECT empno,ename,sal from emp");
        jdbcRs.execute();

        while (jdbcRs.next()) {
        	int eno = jdbcRs.getInt(1);
        	String name = jdbcRs.getString(2);
        	float sal = jdbcRs.getFloat(3); 
            
        	String emp = String.format("%-5d   %-20s     %.2f", eno, name, sal);
			System.out.println(emp);
			
			Thread.sleep(2000);
        }

        jdbcRs.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

	}

}

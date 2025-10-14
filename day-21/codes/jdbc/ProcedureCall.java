package com.spg.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class ProcedureCall {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDBConnection();
		
		CallableStatement cst = con.prepareCall("{ call hike_emp_sal(?,?,?) }");
		
		cst.setInt(1, 103);
		cst.setInt(2, 10);
		
		cst.registerOutParameter(3, Types.FLOAT);
		
		cst.execute();
		
		float updated_salary = cst.getFloat(3);
		System.out.println("hiked salary = " + updated_salary);
		
		cst.close();
		con.close();
	}

}

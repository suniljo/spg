package com.spg.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Connection con = ConnectionFactory.getDBConnection();
		
		PreparedStatement pst = con.prepareStatement("insert into emp(empno, ename,sal) values(?,?,?)");
		
		String req = "Y";
		
		do {
			System.out.println("enter empno, name, sal");
			int eno = sc.nextInt();
			String name = sc.next();
			float sal = sc.nextFloat();
			
			pst.setInt(1, eno);
			pst.setString(2, name);
			pst.setFloat(3, sal);
			
			int n = pst.executeUpdate();
			System.out.println("employee saved!!");
			pst.clearParameters();
			
			System.out.print("do you want to save more employees? [Y/N]: ");
			req = sc.next();
		}while(req.equalsIgnoreCase("Y"));
		
		pst.close();
		con.close();
	}

}

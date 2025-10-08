package com.spg.app;

import com.spg.app.servces.EmployeeServices;

public class Main {
	int age = 42;
	String name;
	
	public void myMethod() {
		System.out.println("my method logic");
	}
	
	public void myMethod1() {
		boolean b = true;
		if(!b) {
			System.out.println("execute this line"); //dead code
		}
	}
	
	public static void main(String[] args) {
		System.out.println("insdie main");
		for(int i=1; i<=100000; i++) {
			System.out.println(i);
		}
		
		EmployeeServices empServices = new EmployeeServices();
		int eid = 101;
		String name = empServices.getEmployeeNameById(eid);
		if(name != null) {
			System.out.println("Welcome " + name);
		}else {
			System.out.println("no employee found");
		}
	}

}

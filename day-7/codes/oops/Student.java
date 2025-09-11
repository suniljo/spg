package com.spg.java.oops;

public class Student {
	String studentId;
	String studentName;
	
	static String collegeName = "S&P College of Engineering";
	
	static int sid = 1001;
	
	public Student(String studentName) {
		super();
		this.studentId = "SPG-"+generateStudentId();
		this.studentName = studentName;
	}

	private int generateStudentId() {
		return sid++;
	}

	@Override
	public String toString() {
		return String.format("Student [%-10s   %-15s  %s]", studentId, studentName, collegeName) ;
	}
	
	
}

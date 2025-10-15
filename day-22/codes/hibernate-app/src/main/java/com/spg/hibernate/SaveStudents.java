package com.spg.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.spg.hibernate.entities.Student;
import com.spg.hibernate.utils.HibernateUtils;

public class SaveStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		String req = "Y";
		
		do {
			System.out.println("enter student name & email: ");
			String sname = sc.next();
			String email = sc.next();
			
			Student st = new Student(sname, email);
			session.persist(st);
			
			System.out.print("do you want to save more students? [Y/N]: ");
			req = sc.next();
			System.out.println();
		}while(req.equalsIgnoreCase("Y"));
		
		
		tx.commit();
		
		session.close();
		sf.close();	
	}

}

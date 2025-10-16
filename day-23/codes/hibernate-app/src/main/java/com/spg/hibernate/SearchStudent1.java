package com.spg.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spg.hibernate.entities.Student;
import com.spg.hibernate.utils.HibernateUtils;

public class SearchStudent1 {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();	
		Session session = sf.openSession();
		
		Student st = new Student();
		System.out.println(st);
		
		try {
			//session.load(st, 101);
			session.load(st, 1105);
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		System.out.println();
		System.out.println(st);
		
		session.close();
		sf.close();
	}
}
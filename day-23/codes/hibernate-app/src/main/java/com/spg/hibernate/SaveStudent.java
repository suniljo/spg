package com.spg.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spg.hibernate.entities.Student;

public class SaveStudent {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml"); //DOM Parsing
		
		SessionFactory sfactory = config.buildSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student st = new Student();
		st.setStudentId(101);
		st.setStudentName("Sanjay");
		st.setStudentEmail("sanjay@gmail.com");
		
		session.persist(st);
		System.out.println("-".repeat(100));
		
		tx.commit();
		
		session.close();
		sfactory.close();
	}

}

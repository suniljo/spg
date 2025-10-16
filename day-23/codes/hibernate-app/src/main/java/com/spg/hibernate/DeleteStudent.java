package com.spg.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spg.hibernate.entities.Student;
import com.spg.hibernate.utils.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();	
		Session session = sf.openSession();
		session.beginTransaction();
		
		/*
		//delete student - approach-1
		Student st = new Student(101, "Sanjay Patil", "sanjay@gmail.com");
		session.remove(st);
		*/
		
		//delete student - approach-2
		int sid = 102;
		Student st = session.find(Student.class, sid);
		if(st != null) {
			System.out.println(st);
			session.remove(st);
		} else {
			System.err.println("no mathching student with id: " + sid);
		}
		
		System.out.println();
		session.getTransaction().commit();
		
		session.close();
		sf.close();
	}
}

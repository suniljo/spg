package com.spg.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spg.hibernate.entities.Student;
import com.spg.hibernate.utils.HibernateUtils;

public class SearchStudent2 {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();	
		Session session = sf.openSession();
		
		//Student st = session.get(Student.class, 102);
		Student st = session.get(Student.class, 1025);
		
		if(st != null)
			System.out.println(st);
		else
			System.err.println("no student with id: 1025");
		
		session.close();
		sf.close();

	}

}

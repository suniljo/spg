package com.spg.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spg.hibernate.entities.Student;
import com.spg.hibernate.utils.HibernateUtils;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();	
		Session session = sf.openSession();
		session.beginTransaction();
		
		/*
		//update student - approach-1
		Student st = new Student(101, "Sanjay Patil", "sanjay@gmail.com");
		session.merge(st);
		*/
		
		//update student - approach-2
		int sid = 102;
		Student st = session.find(Student.class, sid);
		if(st != null) {
			System.out.println(st);
			st.setStudentName("Vinod Vellanki"); // dirty-object
			System.out.println(st);
		} else {
			System.err.println("no mathching student with id: " + sid);
		}
		
		System.out.println();
		session.getTransaction().commit();
		
		session.close();
		sf.close();
	}
}

package com.spg.hibernate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.query.MutationQuery;

import com.spg.hibernate.entities.Student;
import com.spg.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();	
		Session session = sf.openSession();
		
		/*
		//String hql = "from com.spg.hibernate.entities.Student";
		//String hql = "from com.spg.hibernate.entities.Student where studentName='Madhuri'";
		//String hql = "from com.spg.hibernate.entities.Student where studentName LIKE 'S%'";
		String hql = "from com.spg.hibernate.entities.Student where studentId IN (101, 202, 105, 108, 204, 103)";
		Query<Student> q = session.createQuery(hql, Student.class);
		List<Student> studentsList = q.getResultList();
		printStudents(studentsList);
		*/
		
		/*
		String hql = "from com.spg.hibernate.entities.Student where studentId between ?1 and ?2"; //positional parameters
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter(1, 101);
		q.setParameter(2, 106);
		List<Student> studentsList = q.getResultList();
		printStudents(studentsList);
		*/
		
		/*
		String hql = "from Student where studentId between :minsid and :maxsid"; //named parameters
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter("minsid", 106);
		q.setParameter("maxsid", 350);
		List<Student> studentsList = q.getResultList();
		printStudents(studentsList);
		*/
		
		/*
		//-- performing DML operations with HQL
		session.beginTransaction();
		String hql = "update com.spg.hibernate.entities.Student set studentName='Abhilash Pasham', studentEmail='abhilah@spg.com' where studentId=105";
		MutationQuery mq = session.createMutationQuery(hql);
		int rowsAffected = mq.executeUpdate();
		System.out.println("no of students updated = " + rowsAffected);
		session.getTransaction().commit();
		System.out.println();
		*/
		
		
		String hql = "select studentName from Student";
		Query<String> q = session.createQuery(hql, String.class);
		List<String> studentNames = q.getResultList();
		studentNames.forEach(System.out::println);
		
		
		session.close();
		sf.close();
	}

	private static void printStudents(List<Student> studentsList) {
		studentsList.stream()
					.forEach(st -> {
						System.out.println(st);
						try {
							TimeUnit.SECONDS.sleep(1); //Thread.sleep(1000);
						}catch(Exception ex) {}
					});
	}

}

package com.spg.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.spg.hibernate.entities.Address;
import com.spg.hibernate.entities.Employee;
import com.spg.hibernate.utils.HibernateUtils;

public class OTOMapping {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();	
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		/*
		Employee emp = new Employee();
		emp.setEmployeeId(101);
		emp.setEmployeeName("Sunil Joseph");
		emp.setEmployeeSal(74859.75f);
		
		Address addr = new Address();
		addr.setAddressId(1);
		addr.setStreet("Ameerpet");
		addr.setCity("Hyderabad");
		addr.setState("Telangana");
		
		emp.setEmployeeAddr(addr);
		
		session.persist(emp);
		*/
		
		
		Employee emp = session.find(Employee.class, 101);
		if(emp != null) {
			System.out.println(emp);
			session.remove(emp);
		}

		tx.commit();
		session.close();
		sf.close();

	}

}

package com.naveen.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.naveen.model.Address;
import com.naveen.model.Student;

public class TestPersonInsert {

	public static void main(String[] args) {
		Transaction tx=null;
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Address address = new Address("OMR Road", "Chennai", "TN", "600097");
		// By using cascade=all option the address need not be saved explicitly
		// when the student object is persisted the address will be
		// automatically saved.
		// session.save(address);
		Student student1 = new Student("Eswar", address);
		Student student2 = new Student("Joe", address);
		try{
		tx = session.beginTransaction();
		session.save(student1);
		session.save(student2);
		tx.commit();
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}
		finally{
		session.close();
		factory.close();
		}

	}

}

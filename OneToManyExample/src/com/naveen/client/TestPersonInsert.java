package com.naveen.client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.naveen.model.Person;
import com.naveen.model.Vehicle;

public class TestPersonInsert {

	public static void main(String[] args) {
		
		 Configuration config = new Configuration();
		 config.configure("hibernate.cfg.xml");
		 SessionFactory factory = config.buildSessionFactory();
		 Session session = factory.openSession();
		 Person p = new Person();
		 p.setPersonName("hena");
		 
		 Vehicle pd = new Vehicle();
		 pd.setIncome(1233.44);
		 pd.setJob("developer");
		 pd.setZipCode("497449");
		 
		 Vehicle pd1 = new Vehicle();
		 pd1.setIncome(1233.44);
		 pd1.setJob("tester");
		 pd1.setZipCode("560076");
		 
		 p.getVehicle().add(pd);
		 p.getVehicle().add(pd1);
		 
		 Transaction tx = session.beginTransaction();
		 session.save(p);
		 session.save(pd);
		 session.save(pd1);
		 tx.commit();
		 session.close();
		 factory.close();
		 

	}

}

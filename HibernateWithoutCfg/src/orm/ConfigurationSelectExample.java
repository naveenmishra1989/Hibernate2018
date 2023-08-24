package orm;

import org.hibernate.Session;

public class ConfigurationSelectExample {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		 Person p = (Person)session.get(Person.class,25);
		 System.out.println(p);
		 session.close();
		 HibernateUtil.closeFactory();
		 

	}

}

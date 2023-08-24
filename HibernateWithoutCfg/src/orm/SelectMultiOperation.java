package orm;

import java.util.List;

import org.hibernate.Session;

public class SelectMultiOperation {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		List list = session.createQuery("from Person").list();
		for (Object object : list) {
			System.out.println((Person)object);
			
		}

	}

}

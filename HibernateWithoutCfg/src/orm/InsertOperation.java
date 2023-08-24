package orm;

import org.hibernate.Session;

public class InsertOperation {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Person p = new Person();
		p.setPersonName("kanti");
		session.beginTransaction();
		System.out.println("saved is: "+session.save(p));
		session.getTransaction().commit();
		HibernateUtil.closeFactory();

	}

}

package orm;

import java.util.Properties;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


@SuppressWarnings("deprecation")
public class HibernateUtil {

	private static final SessionFactory concreteSessionFactory;
	static {
		try {
			Properties prop = new Properties();
			prop.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
			prop.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521:xe");
			prop.setProperty("hibernate.connection.username", "scott");
			prop.setProperty("hibernate.connection.password", "tiger");
			prop.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");

			prop.setProperty("hibernate.hbm2ddl.auto", "update");
			prop.setProperty("hibernate.show_sql", "true");

			concreteSessionFactory = new AnnotationConfiguration().addProperties(prop).addAnnotatedClass(Person.class)
					.buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static Session getSession() throws HibernateException {
		return concreteSessionFactory.openSession();
	}

	public static void closeFactory() {
		concreteSessionFactory.close();
	}

}

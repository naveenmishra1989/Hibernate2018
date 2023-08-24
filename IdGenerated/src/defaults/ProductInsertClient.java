package defaults;
//ProductInsertClient.java
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class ProductInsertClient 
{
	public static void main(String[] args) 
	{
		//step1
		Configuration conf=new Configuration();
		conf.configure("defaults/hibernate.cfg.xml");
		//step2
		SessionFactory factory=conf.buildSessionFactory();
		//step3
		Session session=factory.openSession();
		//create pojo class object
		Product p=new Product();
		p.setProductName("sheeta");
		p.setPrice(100);
		p.setDate(new Date());
		//step4
		Transaction tx=session.beginTransaction();
		//step5
		session.saveOrUpdate(p);
		//step6
		tx.commit();
		//step7
		session.close();
         //step 8
		factory.close();
	}//end of main()
}//end of class

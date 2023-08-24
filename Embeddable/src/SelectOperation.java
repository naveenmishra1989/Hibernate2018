import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
public class SelectOperation {
	public static void main(String[] args) 
	{
		//step1
		Configuration conf=new Configuration();
			conf.configure("hibernate.cfg.xml");
		//step2
		SessionFactory factory=conf.buildSessionFactory();
		//step3
		Session session=factory.openSession();
		//create pojo class object
		Product data = (Product)session.load(Product.class,10);
		//if we pass here p object the Product class must be serializable type
		System.out.println(data );
		
		System.out.println(data.getProductId());
		System.out.println(data.getPrice());
		System.out.println(data.getProductName());
		
		Address add = data.getAddress();
		System.out.println(add);
		System.out.println(add.getPincode());
		System.out.println(add.getState());
		System.out.println(add.getStreet());
		
		Address add1 = data.getOfficeaddress();
		System.out.println(add1);
		System.out.println(add1.getPincode());
		System.out.println(add1.getState());
		System.out.println(add1.getStreet());
		//step7
		session.close();
         //step 8
		factory.close();
	}//end of main()
}//end of class

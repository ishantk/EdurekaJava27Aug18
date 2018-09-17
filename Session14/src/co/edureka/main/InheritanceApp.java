package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.LEDTV;
import co.edureka.model.Product;
import co.edureka.model.TV;

public class InheritanceApp {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setPrice(30000);
		product.setBrandName("Sony");
		
		TV tv = new TV();
		tv.setPrice(50000);
		tv.setBrandName("Samsung");
		tv.setScreenSize(50);
		tv.setType("Plasma TV");
		
		LEDTV ledtv = new LEDTV();
		ledtv.setPrice(90000);
		ledtv.setBrandName("Samsung");
		ledtv.setScreenSize(60);
		ledtv.setType("Curved LED");
		ledtv.setWattage(100);
		 
		
		// Hibernate Code:
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Read the XML File !! -> hibernate.cfg.xml
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Creating a connection to DB
			
			transaction = session.beginTransaction(); // Start a Transaction
			
			session.save(product);
			session.save(tv);
			session.save(ledtv);
			
			transaction.commit(); // Fire a Transaction
			System.out.println("==Transaction Commited...");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			e.printStackTrace();
		}finally{
			if(session!=null){
				session.close(); // releasing the connection
			}
		}

	}

}

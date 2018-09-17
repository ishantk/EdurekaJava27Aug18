package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.User;

public class OneToOneApp {

	public static void main(String[] args) {
		
		Address aRef = new Address();
		aRef.setAdrsLine("Pristine Magnum");
		aRef.setCity("Bengaluru");
		aRef.setState("Karnataka");
		aRef.setZipCode(520001);
		
		User uRef = new User();
		uRef.setName("John Watson");
		uRef.setEmail("john@example.com");
		
		// Linked Both Ways !!
		uRef.setAddress(aRef);
		aRef.setUser(uRef);
		
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
			
			session.save(uRef); // Saving User Alone shall also save Address Linked to it !!
			
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

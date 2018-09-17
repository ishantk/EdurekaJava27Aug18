package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Student;

public class AnnotationApp {

	public static void main(String[] args) {
		
		Student s1 = new Student(null, "John", 30, "john@example.com", "Redwood Shores");
		Student s2 = new Student(null, "Fionna", 22, "fionna@example.com", "Southern Shores");
		
		System.out.println(s1);
		System.out.println(s2);

		// Save the Objects permanently
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new AnnotationConfiguration();
			config.configure(); // Read the XML File !! -> hibernate.cfg.xml
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Creating a connection to DB
			
			transaction = session.beginTransaction(); // Start a Transaction
			
			session.save(s1);
			session.save(s2);
			
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

package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setEid(null); // Primary Key Auto Increment
		emp1.setName("Mike");
		emp1.setEmail("mike@example.com");
		emp1.setSalry(56000);
		emp1.setAddress("Redwood Shores");
		
		Employee emp2 = new Employee(null, "Leo", 89000, "leo@example.com", "Pristine Magnum");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		// We need to Save the data in DataBase
		// Using Hibernate our effort is reduced
		
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
			
			// Inserting the Data in DB
			session.save(emp1);
			session.save(emp2);
			
			transaction.commit(); // Fire a Transaction
			System.out.println("==Transaction Commited...");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			e.printStackTrace();
		}finally{
			if(session!=null){
				session.close(); // releaseing the connection
			}
		}

	}

}

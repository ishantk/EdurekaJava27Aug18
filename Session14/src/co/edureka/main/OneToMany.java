package co.edureka.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Certificate;
import co.edureka.model.Manager;

public class OneToMany {

	public static void main(String[] args) {
		
		Certificate c1 = new Certificate();
		c1.setCname("OCJP");
		
		Certificate c2 = new Certificate();
		c2.setCname("OCWD");
		
		Certificate c3 = new Certificate();
		c3.setCname("CCNA");
		
		Certificate c4 = new Certificate();
		c4.setCname("CCNP");
		
		Certificate c5 = new Certificate();
		c5.setCname("AWS");
		
		ArrayList<Certificate> list1 = new ArrayList<Certificate>();
		ArrayList<Certificate> list2 = new ArrayList<Certificate>();
		
		list1.add(c1);
		list1.add(c2);
		list1.add(c3);
		
		list2.add(c1);
		list2.add(c4);
		list2.add(c5);
		
		Manager mgr1 = new Manager();
		mgr1.setName("John");
		mgr1.setEmail("john@exampele.com");
		mgr1.setExp(7);
		mgr1.setSalary(70000);
		mgr1.setCertificates(list1); // Has-A Relation Fulfilled
		
		Manager mgr2 = new Manager();
		mgr2.setName("Fionna");
		mgr2.setEmail("fionna@exampele.com");
		mgr2.setExp(9);
		mgr2.setSalary(90000);
		mgr2.setCertificates(list2);
		
		
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
			
			//session.save(mgr2); // Saving Manager will Also Save Certificates
			
			Manager mgr = (Manager)session.get(Manager.class, 1);
			System.out.println(mgr);
			
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

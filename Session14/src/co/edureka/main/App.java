package co.edureka.main;

import java.util.List;

import org.hibernate.CacheMode;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setEid(null); // Primary Key Auto Increment
		emp1.setName("George");
		emp1.setEmail("george@example.com");
		emp1.setSalry(75000);
		emp1.setAddress("Redwood Shores");
		
		Employee emp2 = new Employee(null, "Harry", 40000, "harry@example.com", "Pristine Magnum");
		
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
			// factory can cache data for multiple session objects
		
			
			session = factory.openSession(); // Creating a connection to DB
			
			transaction = session.beginTransaction(); // Start a Transaction
			
			//1. Inserting the Data in DB
			//session.save(emp1);
			//session.save(emp2);
			
			//2. Get a Single Record from DB
			//Employee emp = (Employee)session.get(Employee.class, 5);
			//System.out.println("Employee is: "+emp);
			
			//3. Update Record in DB
			/*Employee emp = (Employee)session.get(Employee.class, 5);
			
			emp.setName("George Watson");
			emp.setEmail("george.w@example.com");
			emp.setAddress("Country Homes");
			
			session.update(emp);*/
			
			//4. Delete from DB
			/*Employee emp = new Employee();
			emp.setEid(5); // We just need ID on which we will perform delete operation
			session.delete(emp);*/
			
			//session.createSQLQuery(); -> Anything as in Raw SQL
			
			//5. Retrieve All !!
			// Hibernate Query Language
			//String hql = "From Employee"; // Very much like SQL
			/*String hql = "From Employee where salary > 50000"; // Very much like SQL // salary is column name
			List<Employee> empList = session.createQuery(hql).list();
			for(Employee emp : empList){
				System.out.println(emp);
			}*/
			
			// Criteria API to Read All Records
			//Criteria criteria = session.createCriteria(Employee.class);
			//criteria.add(Restrictions.gt("salry", 50000)); // salry -> Attribute from Object
			//criteria.add(Restrictions.and(lhs, rhs)); // can be used rules to retrieve data
			
			//List<Employee> empList = criteria.list();
			//for(Employee emp : empList){
			//	System.out.println(emp);
			//}
			
			// We are adding 100 Employee Objects in the session
			/*for(int i=1;i<=100;i++){
				Employee emp = new Employee(null, "Employee"+i, 30000+i, "emp"+i+"@example.com", "Redwood Shores");
				session.save(emp);
			}*/
			
			// We are fetching 2 Employee Objects | 2 Read Operations !!
			Employee e1 = (Employee)session.get(Employee.class, 1);
			Employee e2 = (Employee)session.get(Employee.class, 2);
			
			System.out.println(e1);
			System.out.println(e2);
			
			System.out.println("###### Re Reading ######");
			
			// We are fetching 2 Employee Objects Again !!
			// Select Query will not be fired again. Automatic Cache Management !!
			Employee e3 = (Employee)session.get(Employee.class, 1);
			Employee e4 = (Employee)session.get(Employee.class, 2);
			
			System.out.println(e3);
			System.out.println(e4);
			
			//session.setCacheMode(CacheMode.IGNORE); // No cache
			
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
	
		// Once we close the Session, Cached Data will be LOST !!
		
	}

}

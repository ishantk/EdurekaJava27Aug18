package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.model.Child;
import co.edureka.model.DBSource;
import co.edureka.model.Father;

public class App {

	public static void main(String[] args) {
		
		// Traditionally :
		DBSource source = new DBSource(); // -> Default Object Construction
		source.setUrl("www.edureka.co/somescripts/somedbname/");
		source.setUser("admin");
		source.setPassword("pass123");
		
		System.out.println("===Details===");
		System.out.println(source);

		// What is the Problem ?
		// In a configuration object like above if we wish to update password, entire source code has to be re compiled and re submitted !!

		// What is the Solution ?
		// Spring Framework's Inversion of Control
		
		/*
		 * Step1: Link all Spring Core Jar Files with Project.
		 * Step2: Copy XML File in src directory and configure data for object in that xml file.
		 * Step3: Use IOC Container and get the object
		 * 		  1. BeanFactory
		 * 		  2. ApplicationContext
		 */
		
		// 1. Use IOC Container : BeanFactory
		//Resource resource = new ClassPathResource("beans.xml"); // Parse XML File
		//BeanFactory factory = new XmlBeanFactory(resource);     // Create and Manage Objects
		
		//Objects are not constructed till you say getBean
		/*DBSource source1 = (DBSource)factory.getBean("dbSrc1"); // BeanFactory will now create an object and return back its reference
		DBSource source2 = factory.getBean("dbSrc2",DBSource.class);
		
		System.out.println("===Details===");
		System.out.println(source1);
		
		System.out.println("===Details===");
		System.out.println(source2);*/
		
		//2. Use IOC Container : ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Objects are constructed immediately for us, even we do not ask for them !!

		//DBSource source1 = (DBSource)context.getBean("dbSrc1"); // BeanFactory will now create an object and return back its reference
		//DBSource source2 = context.getBean("dbSrc2",DBSource.class);
		
		//DBSource source2 = (DBSource)context.getBean("dbSrc1"); 
		
		//System.out.println("===source1 Details===");
		//System.out.println(source1);
		
		//System.out.println();
		
		//System.out.println("===source2 Details===");
		//System.out.println(source2);
		
		//Father fRef = context.getBean("fRef",Father.class);
		//System.out.println("==Father Details==");
		//System.out.println(fRef);
		
		Child cRef = context.getBean("cRef",Child.class);
		System.out.println("==Child Details==");
		System.out.println(cRef);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context; // Downcasting
		cxt.close(); // Delete the objects from memory !!
		
	}

}

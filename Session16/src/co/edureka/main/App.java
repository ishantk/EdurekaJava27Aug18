package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.CB;
import co.edureka.model.Student;

public class App {

	public static void main(String[] args) {

		// log4j is a library used to log information in a text file
		
		// Inversion of Control
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		/*Student sRef = context.getBean("stu",Student.class);
		System.out.println(sRef);
		System.out.println("==Ceritificates==");
		System.out.println(sRef.getCertificates());*/
		
		CB cbRef = context.getBean("cb",CB.class);
		cbRef.getCa().sayHello("John");
		
	}

}

package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.Employee;

public class AOPClient {

	public static void main(String[] args) {
	
		// IOC
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Employee emp = (Employee)context.getBean("empProxy");
		Employee emp = context.getBean("empProxy",Employee.class);
		emp.allocateSeatAndDepartment("Java", "Male");
		

	}

}

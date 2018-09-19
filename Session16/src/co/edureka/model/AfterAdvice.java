package co.edureka.model;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
//import org.springframework.aop.framework.ProxyFactoryBean; -> Which must be configured in beans.xml file

public class AfterAdvice implements AfterReturningAdvice{
	

	// afterReturning shall be executed after our business logic executes !!
	@Override
	public void afterReturning(Object beanRef1, Method method, Object[] inputs, Object beanRef2) throws Throwable {
		
		System.out.println("==after execution started=="); 
		
		System.out.println("Method in Execution: "+method.getName());
		
		// Do Some PreProcessing for allocateSeatAndDepartment here
		if(method.getName().equals("allocateSeatAndDepartment")){
			System.out.println("Inputs to allocateSeatAndDepartment:");
			for(Object o : inputs){
				System.out.println(o);
			}
			
			Employee eRef = (Employee)beanRef2;
			System.out.println("PostProcessing for "+eRef.name);
		}
		
		System.out.println("==after execution finished==");
		
		
	}

}

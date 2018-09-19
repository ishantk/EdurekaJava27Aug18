package co.edureka.model;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	// before shall be executed before our business logic executes !!
	@Override
	public void before(Method method, Object[] inputs, Object beanRef) throws Throwable {
		
		System.out.println("==before execution started=="); 
		
		System.out.println("Method in Execution: "+method.getName());
		
		// Do Some PreProcessing for allocateSeatAndDepartment here
		if(method.getName().equals("allocateSeatAndDepartment")){
			System.out.println("Inputs to allocateSeatAndDepartment:");
			for(Object o : inputs){
				System.out.println(o);
			}
			
			Employee eRef = (Employee)beanRef;
			System.out.println("PreProcessing for "+eRef.name);
		}
		
		System.out.println("==before execution finished==");
		
	}

}

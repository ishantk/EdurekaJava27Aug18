package co.edureka.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object beanRef, String beanId) throws BeansException {
		
		System.out.println("==postProcessAfterInitialization=="+beanId);
		
		
		
		return beanRef;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanRef, String beanId) throws BeansException {
		
		System.out.println("==postProcessBeforeInitialization=="+beanId);
		
		DBSource source = (DBSource)beanRef;
		if(source.getUser().isEmpty()){
			System.out.println("==User cannot be empty=="); // validation
		}else{
			System.out.println("==DB Access Granted==");
		}
		
		return beanRef;
	}

}

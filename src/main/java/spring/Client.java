package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.metrics.ApplicationStartup;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("creating the context");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("myBeans.xml");
		Employee ee = context.getBean("developer", Employee.class);
		System.out.println(ee);
		
	}

}

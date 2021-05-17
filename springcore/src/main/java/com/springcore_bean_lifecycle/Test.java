package com.springcore_bean_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new  ClassPathXmlApplicationContext("com/springcore_bean_lifecycle/config.xml");
		//shutdown the bean and for closing all conection like finally block in try,catch
		context.registerShutdownHook();
		Samosa  s1=(Samosa) context.getBean("samosa");
		System.out.println("Garam "+s1);
		
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		Pepsi p1 = (Pepsi)context.getBean("pepsi");
		System.out.println(p1);
	}

}

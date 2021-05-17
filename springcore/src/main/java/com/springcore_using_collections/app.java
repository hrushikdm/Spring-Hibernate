package com.springcore_using_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
	

	public static void main(String[] args) {
		/////System.out.println("OK");
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore_using_collections/config.xml");
		 Emp emp1 =(Emp) context.getBean("emp1");

		 System.out.println(emp1.getName());
		 System.out.println(emp1.getPhones());
		 System.out.println(emp1.getAddress());
		 System.out.println(emp1.getCourses());
		 System.out.println(emp1.getProps());
	}
}

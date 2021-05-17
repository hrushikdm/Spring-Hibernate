package com.springcore_using_setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_using_setter_injection/config.xml");
       																	
       Student s1=(Student) context.getBean("Student1");
       System.out.println(s1);
        
    }
}

package com.wipro.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class StudentApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon=new ClassPathXmlApplicationContext("StudentConfig.xml");
        Student factory=(Student)appCon.getBean("s");
        factory.display();
       
        ((ClassPathXmlApplicationContext) appCon).close();
    }
}

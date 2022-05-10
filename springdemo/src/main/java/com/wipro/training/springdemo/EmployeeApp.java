package com.wipro.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		
		ApplicationContext appCon=new ClassPathXmlApplicationContext("EmployeeConfig.xml");
        Employee factory=(Employee)appCon.getBean("emp");
        factory.display();
        
        /*
         * Employee emp=new Employee():
         * emp.setId(101);
         * emo.setName("James Gosling");
         * emp.setCity("Bangalore"):
         */
       
        ((ClassPathXmlApplicationContext) appCon).close();

	}

}
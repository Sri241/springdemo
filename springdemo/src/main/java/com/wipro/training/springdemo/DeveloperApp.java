package com.wipro.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperApp {

	public static void main(String[] args) {
		
		ApplicationContext appCon=new ClassPathXmlApplicationContext("DeveloperConfig.xml");
        Developer factory=(Developer)appCon.getBean("d1");
        factory.display();
        
        ((ClassPathXmlApplicationContext) appCon).close();

	}

}

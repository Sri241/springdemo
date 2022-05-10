package com.wipro.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnswerApp {

	public static void main(String[] args) {
		
		ApplicationContext appCon=new ClassPathXmlApplicationContext("AnswerConfig.xml");
        Answer factory=(Answer)appCon.getBean("ans1");
        System.out.println(factory);
        
        Answer factory1=(Answer)appCon.getBean("ans2");
        System.out.println(factory1);
       
     
        ((ClassPathXmlApplicationContext) appCon).close();
	}
}

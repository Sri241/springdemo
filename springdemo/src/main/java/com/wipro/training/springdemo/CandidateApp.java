package com.wipro.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CandidateApp {

	public static void main(String[] args) {
		
		ApplicationContext appCon=new ClassPathXmlApplicationContext("CandidateConfig.xml");
        Candidate factory=(Candidate)appCon.getBean("cd");
        factory.disp();
        
        ((ClassPathXmlApplicationContext) appCon).close();

	}

}

package com.wipro.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookApp {

	public static void main(String[] args) {
		
		ApplicationContext appCon=new ClassPathXmlApplicationContext("BookConfig.xml");
        Book factory=(Book)appCon.getBean("book1");
        factory.show();
       
      //Book book1=new Book(10,"BalaGuruSwamy",500);
        //book1.show();
        ((ClassPathXmlApplicationContext) appCon).close();


	}

}

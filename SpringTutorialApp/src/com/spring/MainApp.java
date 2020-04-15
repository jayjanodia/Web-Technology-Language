package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1:Configure spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//instantiate xml interface.
		
		//2. create and use bean
		Student student = (Student) context.getBean("student",Student.class);
	
		
		//3.call bean functions
		System.out.println(student);
		student.showAddress();
		
		//4, close applicationCOntext object
		//context.close();
	}

}

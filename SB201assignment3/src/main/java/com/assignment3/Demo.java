package com.assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Application app = ac.getBean("application",Application.class);
		app.printCities();
		((ClassPathXmlApplicationContext)ac).close();
	}

}

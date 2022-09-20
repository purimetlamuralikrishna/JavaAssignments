package com.circularDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ClassA a =app.getBean("classA",ClassA.class);
		a.printMsg();
		
		((ClassPathXmlApplicationContext)app).close();

	}

}

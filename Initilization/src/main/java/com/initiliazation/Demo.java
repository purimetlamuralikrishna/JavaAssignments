package com.initiliazation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*


Q2. What are the steps involved in the bean life cycle? 


	There are 5 stages involved in bean life Cycle:
	They are:
	
		1. Does not exist
		2. Instantiated
		3. Initialized
		4. Service
		5. Destroy

*/




public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		InitDestroy id =  appContext.getBean("initiate",InitDestroy.class);
		id.fun();
		((ClassPathXmlApplicationContext) appContext).close();

	}

}

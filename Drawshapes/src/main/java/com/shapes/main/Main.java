package com.shapes.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shapes.draw.Draw;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Draw d = ctx.getBean(Draw.class,"shape");
		d.printShape();
		
		
		
		
		
		
		
	}

}

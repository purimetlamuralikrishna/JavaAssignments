package com.shapes.impl;

import com.shapes.intr.Drawshapes;

public class Circle implements Drawshapes {
	
	
	public void myShape() {
		System.out.println("You have drawn Circle");
	}
	

	@Override
	public void draw() {	
		myShape();	
	}

}

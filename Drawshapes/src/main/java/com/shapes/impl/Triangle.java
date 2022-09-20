package com.shapes.impl;

import com.shapes.intr.Drawshapes;

public class Triangle implements Drawshapes {
	
	
	
	public void myShape() {
		System.out.println("You have drawn Triangle");
	}

	@Override
	public void draw() {
		
		myShape();
		
	}

}

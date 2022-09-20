package com.shapes.impl;

import com.shapes.intr.Drawshapes;

public class Cylinder implements Drawshapes {
	
	
	public void myShape() {
		System.out.println("You have drawn Cylinder");
	}

	@Override
	public void draw() {
		myShape();
		
	}

}

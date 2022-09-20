package com.shapes.draw;

import com.shapes.intr.Drawshapes;

public class Draw {

	Drawshapes drawShapes;

	public void setDrawShapes(Drawshapes drawShapes) {
		this.drawShapes = drawShapes;
	}
	
	
	public void printShape() {
		drawShapes.draw();
	}
	
	
}

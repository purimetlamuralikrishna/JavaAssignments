package com.murali;

public class MainShapes {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		
		Shapes shape = new Shapes();
		
		shape.area(circle);
		shape.area(rectangle);
		shape.area(square);

	}

}

class Shapes{
	
	
	public void area(Circle circle){
		System.out.println("This is Circle object");
	}
	public void area(Rectangle rectangle){
		System.out.println("This is Rectangle object");
	}
	public void area(Square square){
		System.out.println("This is Square object");
	}
}

class Circle{
	int radius;
}
class Rectangle{
	int length;
	int breadth;
}
class Square{
	int side;
}

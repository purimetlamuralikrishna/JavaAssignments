package shapes.Abstract;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		System.out.println("Area of Rectangle is: "+ (length*breadth));
		return length*breadth;
	}

	@Override
	public int squareArea(int side) {
		System.out.println("Area of Square is: "+ (side*side));
		return side*side;
	}

	@Override
	public int circleArea(int radius) {
		System.out.println("Area of circle is: "+ (int)((2*3.14)*(radius*radius)));
		return (int)((2*3.14)*(radius*radius));
	}

}

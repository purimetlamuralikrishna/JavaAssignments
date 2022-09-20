package shapes.Abstract;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Area area = new Area();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length and breadth of a rectangle");
		area.rectangleArea(sc.nextInt(),sc.nextInt());
		
		System.out.println("Enter side length  of a square");
		area.squareArea(sc.nextInt());
		
		System.out.println("Enter radius of a rectangle");
		area.circleArea(sc.nextInt());
		
		sc.close();
		
		

	}

}

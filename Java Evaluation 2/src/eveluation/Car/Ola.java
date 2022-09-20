package eveluation.Car;

public class Ola {
	
	
	public Car bookCar(int numberOfPassenger, int numberOfKms) {
		
		if(numberOfPassenger<=3) {
			HatchBack hatchBack = new HatchBack(numberOfPassenger,numberOfKms);
			return hatchBack;
		}
		
		Sedan sedan = new Sedan(numberOfPassenger,numberOfKms);
		return sedan;
	}
	
	public int calculateBill(Car car) {
		
		int totalFare = car.numberOfKms*15;
		return totalFare;
	}
}

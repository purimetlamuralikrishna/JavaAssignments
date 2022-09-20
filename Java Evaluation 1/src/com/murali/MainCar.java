package com.murali;

public class MainCar {
	
	

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		Engine engine = new Engine(1000,110,"tata");
		engine.enableTurboEngine();
		Car car2 = new Car("Harrier","tata","red",engine);
		
		System.out.println("This is car1 Object " + car1);
		System.out.println();
		
		System.out.println("Car Model: "+car2.model);
		System.out.println("Car Company Name: "+car2.companyName);
		System.out.println("Car Color: "+car2.color);
		System.out.println("Car Engine RPM: "+car2.engine.rmp);
		System.out.println("Car Engine Power: "+car2.engine.power);
		System.out.println("Car Engine Manufacturer: "+car2.engine.manufacturer);
		System.out.println("Car Engine Has Turbo: "+car2.engine.hasTurbo);
		
		
	}

}

class Car{
	String model;
	String companyName;
	String color;
	Engine engine;
	
	Car(){
		
	}
	
	Car(String model,String companyName,String color,Engine engine){
		
		this.model = model;
		this.companyName = companyName;
		this.color = color;
		this.engine = engine;
		
	}
}

class Engine{
	int rmp;
	int power;
	String manufacturer;
	Boolean hasTurbo;
	
	Engine(int rmp,int power,String manufacturer){
		this.rmp = rmp;
		this.power = power;
		this.manufacturer = manufacturer;
	}
	
	public void enableTurboEngine() {
		this.hasTurbo = true;
	}
}

package com.behavior;

public class MainApp {

	public static void main(String[] args) {
		
		FamilyCar car = new FamilyCar(false, 7);
		car.getEngine().createEngine();

		car.checkMileage();
		car.stopEngine();
		car.startEngine();
		car.ride();
		car.refill();
		car.ride();
		car.stopEngine();
		
		System.out.println();
		System.out.println(car.toString());
		System.out.println();
		
		car.drive(70);
		car.checkMileage();
		car.refill(20);
		
		System.out.println();
		System.out.println(car.toString());
	}

}

package com.behavior;

public abstract class Car {

	private int mileage;
	private boolean hasPetrolEngine;
	private GasTank tank;
	private Engine engine;
	private int fuel;
	private boolean isRunning;

	public Car(boolean hasPetrolEngine) {
		this.mileage = 0;
		this.fuel = 0;
		this.isRunning = false;
		this.hasPetrolEngine = hasPetrolEngine;
		if (hasPetrolEngine) {
			this.tank = new PetrolTank();
			this.engine = new PetrolEngine();
		} else {
			this.tank = new DieselTank();
			this.engine = new DieselEngine();
		}
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public boolean isHasPetrolEngine() {
		return hasPetrolEngine;
	}

	public void setHasPetrolEngine(boolean hasPetrolEngine) {
		this.hasPetrolEngine = hasPetrolEngine;
	}

	public GasTank getTank() {
		return tank;
	}

	public void setTank(GasTank tank) {
		this.tank = tank;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void startEngine() {
		if (isRunning == true) {
			System.out.println("Car is already running");
		} else {
			if (fuel < 5) {
				System.out.println("Tank is empty");
			} else {
				isRunning = true;
				System.out.println("Car is running");
			}
		}
	}

	public void stopEngine() {
		if (isRunning == true) {
			isRunning = false;
			System.out.println("Car stopped");
		} else {
			System.out.println("Can't stop a stopped car");
		}
	}

	public void ride() {
		if (fuel >= 1) {
			isRunning = true;
			System.out.print("Car is running; ");
			fuel = fuel - 1;
			mileage = mileage + 10;
			isRunning = false;
			System.out.println("Car stopped");
		} else {
			System.out.println("Tank is empty");
		}
	}

	public void drive(int distance) {
		if (distance / 10 <= fuel) {
			isRunning = true;
			System.out.print("Car is running; ");
			fuel = fuel - (distance / 10);
			mileage = mileage + distance;
			isRunning = false;
			System.out.println("Car stopped");
		} else {
			System.out.println("There is not enough fuel to cover this distance");
		}
	}

	public void refill() {
		fuel = tank.getCapacity();
		System.out.println("Tank refilled succesfully");
	}

	public void refill(int amount) {
		if (fuel + amount < tank.getCapacity()) {
			fuel = fuel + amount;
			System.out.println("Tank refilled succesfully");
		}
		else {
			System.out.println("The resulting quantity exceeds the maximum quantity; Try to put less fuel.");
		}
	}

	public int checkFuelLevel() {
		return fuel;
	}

	public String isFuelEnoughtForARide() {
		if (fuel >= 1)
			return "Is enough fuel for a ride";
		else
			return "Isn't enough fuel for a ride";
	}

	public void checkMileage() {
		System.out.println("The mileage of this car is: " + mileage + " km");
	}

	@Override
	public String toString() {
		return "Car [mileage=" + mileage + ", hasPetrolEngine=" + hasPetrolEngine + ", tank=" + tank + ", engine="
				+ engine + ", fuel=" + fuel + ", isRunning=" + isRunning + "]";
	}

	
	
}

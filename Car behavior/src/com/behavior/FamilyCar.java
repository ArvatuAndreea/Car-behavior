package com.behavior;

public class FamilyCar extends Car{

	private int numberOfSeats;

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public FamilyCar(boolean hasPetrolEngine, int numberOfSeats) {
		super(hasPetrolEngine);
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return super.toString() + ", number of seats = " + numberOfSeats;
	}

	
}

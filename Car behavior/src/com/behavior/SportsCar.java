package com.behavior;

public class SportsCar extends Car {

	private int power;

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public SportsCar(boolean hasPetrolEngine, int power) {
		super(hasPetrolEngine);
		this.power = power;
	}

	@Override
	public String toString() {
		return super.toString() + ", power = " + power;
	}


	
}

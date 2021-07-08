package com.behavior;

public class PetrolTank extends GasTank{

	private String type = "petrol tank";

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return super.toString() + ", type = " + type;
	}
	
	
}

package com.behavior;

public class DieselTank extends GasTank{

	private String type = "diesel tank";

	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", type = " + type;
	}
	
}

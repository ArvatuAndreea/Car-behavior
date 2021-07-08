package com.behavior;

public abstract class GasTank {

	private int capacity = 50;

	public int getCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		return "GasTank [capacity=" + capacity + "]";
	}
	
	
}

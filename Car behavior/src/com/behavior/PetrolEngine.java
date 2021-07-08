package com.behavior;

public class PetrolEngine implements Engine{

	private String type;
	
	public String getType() {
		return type;
	}

	public PetrolEngine() {
	}
	
	@Override
	public void createEngine() {
		type = "petrol engine";
	}

	public String toString() {
		return "Engine [type=" + type + "]";
	}
}

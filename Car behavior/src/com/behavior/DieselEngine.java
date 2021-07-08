package com.behavior;

public class DieselEngine implements Engine{

	private String type;
	
	public String getType() {
		return type;
	}
	
	public DieselEngine() {
	}
	
	@Override
	public void createEngine() {
		type = "diesel engine";
	}

	public String toString() {
		return "Engine [type=" + type + "]";
	}
}

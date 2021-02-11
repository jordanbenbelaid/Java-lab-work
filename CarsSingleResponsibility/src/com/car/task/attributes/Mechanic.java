package com.car.task.attributes;

	
public class Mechanic {
	
	private Car car;
	private int mileage;
	
	public void changeTyres(Car car) {
		car.setNewTyres(true);
	}
	
}

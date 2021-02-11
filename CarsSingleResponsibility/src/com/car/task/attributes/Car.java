package com.car.task.attributes;

public class Car {
	private String colour;
    private String model;
    private int mileage;
    private boolean newTyres;

    // constructor
    public Car(String colour, String model, int mileage) {
        this.colour = colour;
        this.model = model;
        this.mileage = mileage;
        this.newTyres = false;
    }

    // getters and setters for colour and model
    // getter for model
    public String getColour() {
        return colour;
    }

    // setter for colour
    public void setColour(String colour) {
        this.colour = colour;
    }

    // functionality
    public void colour(String colourSet) {
        this.setColour(this.getMileage() + colourSet);
    }
    
    // getter for model
    public String getModel() {
        return model;
    }

    // setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // functionality
    public void model(String modelSet) {
        this.setModel(this.getModel() + modelSet);
    }
    
    
    // getter for mileage
    public int getMileage() {
        return mileage;
    }

    // setter for mileage
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // functionality
    public void drive(int milesDriven) {
        this.setMileage(this.getMileage() + milesDriven);
    }

    public boolean getNewTyres() {
    	return newTyres;
    }
    
    public void setNewTyres(boolean tyres) {
    	this.newTyres = tyres;
    }
    
//    public void tyres(boolean newTyres) {
//    	this.setNewTyres(this.getNewTyres() + newTyres);
//    }
}

package com.abstracte.demo;

public abstract class Shape {
	protected String colour;
	protected boolean filled;

	
	
public Shape() {
	
}

public Shape(String Colour,boolean filled) {
	this.colour=Colour;
	this.filled=filled;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour=colour;
}
public boolean isFilled() {
	return filled;
}
public void setFilled(boolean filled) {
	this.filled=filled;
}


public abstract double getArea();

public abstract double getPerimeter(); 


@Override
public String toString() {
	return "Shape [Colour=" + colour + ", Filled=" + filled +  "]";
}

}



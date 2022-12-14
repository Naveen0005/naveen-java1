package com.abstracte.demo;

public class Rectangle extends Shape{
	protected double width;
	protected double length;
	
public Rectangle () {
}

public Rectangle(double width, double length) {
	this.width = width;
	this.length = length;
}

public Rectangle(double width, double length,String colour,boolean filled) {
	super(colour,filled);
	this.width = width;
	this.length = length;
}

public double getWidth() {
	return width;
}

public void setWidth(double Width) {
	this.width = Width;
}

public double getLength() {
	return length;
}

public void setLength(double length) {
	this.length = length;
}


@Override
public double getArea() {
	return 0.0;
}

@Override
public double getPerimeter() {
	return 0.0;
}

@Override
public String toString() {
	return "Rectangle [Width=" + width + ", Length=" + length + "]";
}



}



package com.abstracte.demo;

public class Circle extends Shape {
	protected double radius;
	
public Circle() {
	
}

public Circle(double radius,String colour,boolean filled) {
	super(colour,filled);
	this.radius=radius;

}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

@Override
public double getArea() {
  return Math.PI * radius * radius;
}

@Override
public double getPerimeter() {
	return 2 * Math.PI * radius;
}

@Override
public String toString() {
	return "Circle [Radius=" + radius + "]";
}



}



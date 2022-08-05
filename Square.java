package com.abstracte.demo;

public class Square extends Rectangle{

public Square() {
	
}


public Square(double Side) {
this.width = Side;
}

public Square(double side,String colour,boolean filled) {
	this.width = side;
	this.colour=colour;
	this.filled=filled;
	
}


public double getSide() {
	return width;
}


public void setSide(double Side) {
	this.width = Side;
}

public void setWidth(double Side) {
	this.width=Side;
}
public void setLength(double Side) {
	this.width=Side;
}


@Override
public double getArea() {
	return width*width;
}


@Override
public double getPerimeter() {
	return 4*width;
}

@Override
public String toString() {
	return "Square [Side=" + width + "]";
}



	
	


}

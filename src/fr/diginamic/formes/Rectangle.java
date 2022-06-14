package fr.diginamic.formes;

public class Rectangle extends Shape {

	//Instance attributes
	protected double length;
	protected double width;
	
	//Constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	//Instance methods
	public double calculatePerimeter() {
		return 2 * (this.length + this.width);
	}
	
	public double calculateArea() {
		return this.length * this.width;
	}

	//Getters
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}

	//Setters
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
}

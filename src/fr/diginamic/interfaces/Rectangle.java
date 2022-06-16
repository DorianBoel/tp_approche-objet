package fr.diginamic.interfaces;

public class Rectangle implements GeometricObject {

	//Instance attributes
	private double width, length;
	
	//Constructor
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	//Instance methods
	@Override
	public double perimeter() {
		return 2 * (this.length + this.width);
	}

	@Override
	public double area() {
		return this.length * this.width;
	}
	
	public void displayInfo() {
		System.out.println("Ce rectangle a un périmètre de " + this.perimeter() + " et a une surface de " + this.area());
	}

	//Getters
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	//Setters
	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

}

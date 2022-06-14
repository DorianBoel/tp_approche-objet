package fr.diginamic.entites;

public class Circle {

	//Instance attributes
	private double radius;
	
	//Constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//Instance methods
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public double getSurface() {
		return Math.PI * Math.pow(this.radius, 2.0);
	}

	//Getters
	public double getRadius() {
		return radius;
	}

	//Setters
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}

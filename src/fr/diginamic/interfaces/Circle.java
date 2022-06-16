package fr.diginamic.interfaces;

public class Circle implements GeometricObject {

	//Instance attributes
	private double radius;
	
	//Constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	//Instance methods
	@Override
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(this.radius, 2.0);
	}
	
	public void displayInfo() {
		System.out.println("Ce cercle a un périmètre de " + this.perimeter() + " et a une surface de " + this.area());
	}

	//Getters
	public double getRadius() {
		return radius;
	}

	//Setters
	public void setRadius(int radius) {
		this.radius = radius;
	}

}

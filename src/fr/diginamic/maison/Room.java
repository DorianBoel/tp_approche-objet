package fr.diginamic.maison;

public abstract class Room {

	//Instance attributes
	protected int floor;
	protected double area;
	
	//Constructor
	public Room(int floor, double area) {
		this.floor = floor;
		this.area = area;
	}

	//Getters
	public int getFloor() {
		return floor;
	}

	public double getArea() {
		return area;
	}

	//Setters
	public void setFloor(int floor) {
		this.floor = floor;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
}

package fr.diginamic.formes;

public class Square extends Rectangle {
	
	//Constructor
	public Square(double side) {
		super(side, side);
	}
	
	//Setters
	@Override
	public void setLength(double length) {
		this.length = length;
		this.width = length;
	}
	
	@Override
	public void setWidth(double width) {
		this.setLength(width);
	}
	
}

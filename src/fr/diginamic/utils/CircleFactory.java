package fr.diginamic.utils;

import fr.diginamic.entites.Circle;

public class CircleFactory {
	
	public static Circle createCircle(double radius) {
		return new Circle(radius);
	}
	
}

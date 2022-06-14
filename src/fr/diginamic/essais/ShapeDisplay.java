package fr.diginamic.essais;

import fr.diginamic.formes.Shape;

public class ShapeDisplay {
	
	public static void displayShape(Shape shape) {
		System.out.println("Périmètre: " + shape.calculatePerimeter() + ", Surface: " + shape.calculateArea());
	}
	
}

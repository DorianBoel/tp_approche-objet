package fr.diginamic.essais;

import fr.diginamic.formes.Shape;
import fr.diginamic.formes.Circle;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Square;

public class TestForme {

	public static void main(String[] args) {

		Circle circle = new Circle(6);
		Rectangle rectangle = new Rectangle(3, 7);
		Square square = new Square(9);
		
		for (Shape shape : new Shape[] {circle, rectangle, square}) {
			ShapeDisplay.displayShape(shape);
		}
		
	}

}

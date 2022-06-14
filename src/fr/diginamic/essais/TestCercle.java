package fr.diginamic.essais;

import fr.diginamic.entites.Circle;
import fr.diginamic.utils.CircleFactory;

public class TestCercle {

	public static void main(String[] args) {

		Circle circle1 = CircleFactory.createCircle(3.5);
		Circle circle2 = CircleFactory.createCircle(42.83);
		
		System.out.println("Périmètre: " + circle1.getPerimeter() + ", Surface: " + circle1.getSurface());
		System.out.println("Périmètre: " + circle2.getPerimeter() + ", Surface: " + circle2.getSurface());
		
	}

}

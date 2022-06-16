package fr.diginamic.interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {

		GeometricObject[] geometricArray = {new Circle(2), new Rectangle(3, 7.31)};
		
		for (GeometricObject shape : geometricArray) {
			shape.displayInfo();
		}
		
	}

}

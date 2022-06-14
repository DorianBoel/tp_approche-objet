package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		double a = 50.0;
		double b = 0.5;

		System.out.println(a + " + " + b + " = " + Operations.calculate(a, b, '+'));
		System.out.println(a + " - " + b + " = " + Operations.calculate(a, b, '-'));
		System.out.println(a + " * " + b + " = " + Operations.calculate(a, b, '*'));
		System.out.println(a + " / " + b + " = " + Operations.calculate(a, b, '/'));
		
	}

}

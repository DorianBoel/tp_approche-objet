package fr.diginamic.essais;

import fr.diginamic.operations.AverageCalculator;

public class TestMoyenne {
	
	public static void main(String[] args) {
		
		double[][] doubleTable = {{2.6, 3.0, 78.0, 565.32}, {0.3, 1.0, -0.01, 0.89, -0.45}};
		
		for (double[] doubleArray : doubleTable) {
			AverageCalculator averageCalculator = new AverageCalculator();
			for (double d : doubleArray) {
				averageCalculator.addToArray(d);
			}
			System.out.println("Moyenne de " + averageCalculator.getDoubleArrayReadable() + " : " + averageCalculator.calculateAverage());
		}
		
	}
}

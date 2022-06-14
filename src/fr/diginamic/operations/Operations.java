package fr.diginamic.operations;

public class Operations {

	//Class methods
	public static double calculate(double a, double b, char operator) {
		double result;
		switch (operator) {
			case '+' :
				result = a + b;
				break;
			case '-' :
				result = a - b;
				break;
			case '*':
				result = a * b;
				break;
			case '/':
				result = a / b;
				break;
			default:
				result = 0.0;
		}
		return result;
	}
	
}

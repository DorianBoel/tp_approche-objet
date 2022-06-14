package fr.diginamic.operations;

public class AverageCalculator {

	//Instance attributes;
	private double[] doubleArray = {};
	
	//Instance method;
	public void addToArray(double newDouble) {
		double[] newArray = new double[this.doubleArray.length + 1];
		for (int i = 0; i < this.doubleArray.length; i++) {
			newArray[i] = this.doubleArray[i];
		}
		newArray[this.doubleArray.length] = newDouble;
		this.doubleArray = newArray;
	}
	
	public double calculateAverage() {
		double average = 0;
		for (int i = 0; i < this.doubleArray.length; i++) {
			average += this.doubleArray[i];
		}
		return average / this.doubleArray.length;
	}
	
	public String getDoubleArrayReadable() {
		String str = "{";
		for (int i = 0; i < this.doubleArray.length; i++) {
			if (i != this.doubleArray.length - 1) {
				str += this.doubleArray[i] + ", ";
			} else {				
				str += this.doubleArray[i];
			}
		}
		str += "}";
		return str;
	}

	//Getters
	public double[] getDoubleArray() {
		return doubleArray;
	}
	
}

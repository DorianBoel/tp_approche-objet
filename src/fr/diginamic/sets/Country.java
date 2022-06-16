package fr.diginamic.sets;

public class Country {
	
	// Instance attributes
	private String name;
	private int population, gdpCapita;
	
	// Constructor
	public Country(String name, int population, int gdpCapita) {	
		this.name = name;
		this.population = population;
		this.gdpCapita = gdpCapita;
	}
	
	// Instance attributes
	public long getTotalGdp() {
		return (long) this.population * this.gdpCapita;
	}
	
	public void displayInfo() {
		System.out.println(this.name + ", " + this.population + " habitants, PIB Total: " + this.getTotalGdp() );
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public int getGdpCapita() {
		return gdpCapita;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void setGdpCapita(int gdpCapita) {
		this.gdpCapita = gdpCapita;
	}

}

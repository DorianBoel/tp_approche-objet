package fr.diginamic.maps;

public class City {

	// Instance attributes
	private String name;
	private int population;
	
	// Constructor
	public City(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}
	
	// Instance methods
	public void displayInfo() {
		System.out.println(name + ", " + population + " habitants");
	}

	// Getters
	public String getName() {
		return name;
	}
	
	public int getPopulation() {
		return population;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
}

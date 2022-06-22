package fr.diginamic.maps;

public class Country {

	// Instance attributes
	private String name, continent;
	private int population;
	
	// Constructor
	public Country(String name, int population, String continent) {
		super();
		this.name = name;
		this.population = population;
		this.continent = continent;
	}

	// Getters
	public String getName() {
		return this.name;
	}
	
	public int getPopulation() {
		return this.population;
	}
	
	public String getContinent() {
		return this.continent;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
}

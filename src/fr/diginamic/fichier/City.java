package fr.diginamic.fichier;

public class City {

	// Instance attributes
	private String name, departmentCode, region;
	private int population;
	
	// Constructor
	public City(String name, String departmentCode, String region, int population) {
		this.name = name;
		this.departmentCode = departmentCode;
		this.region = region;
		this.population = population;
	}

	// Getters
	public String getName() {
		return this.name;
	}

	public String getDepartmentCode() {
		return this.departmentCode;
	}

	public String getRegion() {
		return this.region;
	}

	public int getPopulation() {
		return this.population;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}

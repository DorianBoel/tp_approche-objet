package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

public class Department {

	// Instance attributes
	private String code, regionCode;
	private List<City> cities = new ArrayList<>();
	
	// Constructor
	public Department(String code, String regionCode, List<City> list) {
		this.code = code;
		this.regionCode = regionCode;
		this.cities.addAll(list);
	}
	
	//Instance methods
	public int getPopulation() {
		int population = 0;
		for (City city : this.cities) {
			population += city.getPopulation();
		}
		return population;
	}
	
	@Override
	public String toString() {
		return 
			"Département " + this.getCode() + ", " 
			+ NumUtils.format(this.getPopulation()) + " habitants"
		;
	}

	// Getters
	public String getCode() {
		return this.code;
	}
	
	public String getRegionCode() {
		return this.regionCode;
	}

	public List<City> getCities() {
		return this.cities;
	}

	// Setters
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	
}

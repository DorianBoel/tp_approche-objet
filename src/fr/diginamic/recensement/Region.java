package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

public class Region extends GeographicEntity {

	// Instance attributes
	private String name, code;
	private List<Department> departments = new ArrayList<>();
	
	// Constructor
	public Region(String name, String code, List<Department> departments) {
		this.name = name;
		this.code = code;
		this.departments.addAll(departments);
	}
	
	// Instance methods
	public int getPopulation() {
		int population = 0;
		for (Department department : this.departments) {
			population += department.getPopulation();
		}
		return population;
	}
	
	public List<City> getCities() {
		List<City> list = new ArrayList<>();
		for (Department department : this.departments) {
			list.addAll(department.getCities());
		}
		return list;
	}
	
	@Override
	public String toString() {
		return 
			this.name + " (" + this.code + "), "
			+ NumUtils.format(this.getPopulation()) + " habitants"
		;
	}

	// Getters
	public String getName() {
		return this.name;
	}

	public String getCode() {
		return this.code;
	}

	public List<Department> getDepartments() {
		return this.departments;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}

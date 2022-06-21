package fr.diginamic.recensement;

public class City {

	// Instance attributes
	private String name, cityCode, departmentCode, regionName, regionCode;
	private int population;
	
	//Constructor
	public City(String name, String cityCode, String departmentCode, String regionName, String regionCode, int population) {
		this.name = name;
		this.cityCode = cityCode;
		this.departmentCode = departmentCode;
		this.regionName = regionName;
		this.regionCode = regionCode;
		this.population = population;
	}
	
	// Instance methods
	public String getFullCityCode() {
		return this.departmentCode + this.cityCode;
	}
	
	@Override
	public String toString() {
		return
			this.name + " (" + this.getFullCityCode() + "), "
			+ this.regionName + " (" + this.regionCode + "), "
			+ NumUtils.format(this.population) + " habitants"
		;
	}
	
	// Getters
	public String getName() {
		return this.name;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public String getDepartmentCode() {
		return this.departmentCode;
	}

	public String getRegionName() {
		return this.regionName;
	}

	public String getRegionCode() {
		return this.regionCode;
	}

	public int getPopulation() {
		return this.population;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
}

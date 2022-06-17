package fr.diginamic.tri;

import java.util.Comparator;

public class CityNameComparator implements Comparator<City> {

	// Constructor
	public CityNameComparator() {
		
	}

	// Instance methods
	@Override
	public int compare(City city1, City city2) {
		return city1.getName().compareTo(city2.getName());
	}

}

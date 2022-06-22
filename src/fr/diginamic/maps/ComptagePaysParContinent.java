package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ComptagePaysParContinent {

	public static void main(String[] args) {
		
		List<Country> countryList = new ArrayList<>(
			Arrays.asList(
				new Country("France", 65_000_000, "Europe"),
				new Country("Allemagne", 80_000_000, "Europe"),
				new Country("Belgique", 10_000_000, "Europe"),
				new Country("Russie", 150_000_000, "Asie"),
				new Country("Chine", 1_400_000_000, "Asie"),
				new Country("Indonésie", 220_000_000, "Océanie"),
				new Country("Australie", 20_000_000, "Océanie")
			)	
		);
		
		Map<String, Integer> populationPerContinent = new HashMap<>();
		
		for (Country c1 : countryList) {
			String continent = c1.getContinent();
			int totalPopulation = 0;
			for (Country c2 : countryList) {
				if (c2.getContinent().equals(continent)) {
					totalPopulation += c2.getPopulation();
				}
			}
			populationPerContinent.put(continent, totalPopulation);
		}
		
		for (String continent : populationPerContinent.keySet()) {
			int population = populationPerContinent.get(continent);
			System.out.println(continent + ", " + population + " habitants");
		}

	}

}

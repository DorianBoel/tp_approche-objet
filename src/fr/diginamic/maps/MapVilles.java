package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.diginamic.listes.City;

public class MapVilles {

	public static void main(String[] args) {

		List<City> cityList = new ArrayList<>(
			Arrays.asList(
				new City("Nice", 343_000),
				new City("Carcassonne", 47_800),
				new City("Narbonne", 53_400),
				new City("Lyon", 484_000),
				new City("Foix", 9_700),
				new City("Pau", 77_200),
				new City("Marseille", 850_700),
				new City("Tarbes", 40_600)
			)
		);
		
		Map<String, City> cityMap = new HashMap<>();
		
		for (City city : cityList) {
			cityMap.put(city.getName(), city);
		}
		
		String cityLeastPopulation = null;
		int minPopulation = (int) Float.POSITIVE_INFINITY;
		for (String name : cityMap.keySet()) {
			City city = cityMap.get(name);
			if (city.getPopulation() < minPopulation) {
				cityLeastPopulation = name;
			}
		}
		System.out.println("La ville la moins populée est " + cityLeastPopulation);
		System.out.println();
		
		cityMap.remove(cityLeastPopulation);
		System.out.println("On la supprime de la map");
		System.out.println();
		
		System.out.println("Liste des villes dans la map:");
		System.out.println();
		for (String name : cityMap.keySet()) {
			City city = cityMap.get(name);
			city.displayInfo();
		}
		
	}

}

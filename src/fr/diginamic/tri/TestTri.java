package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTri {
	
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
		
		Collections.sort(cityList);
		System.out.println("On trie les éléments de la liste par ordre alphabétique:");
		
		for (City city : cityList) {
			System.out.println("  " + city.getName());
		}
		
	}
	
}

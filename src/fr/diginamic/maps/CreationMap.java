package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {

		Map<String, Float> salaryMap = new HashMap<>();
		salaryMap.put("Paul", 1750f);
		salaryMap.put("Hicham", 1825f);
		salaryMap.put("Yu", 2250f);
		salaryMap.put("Ingrid", 2015f);
		salaryMap.put("Chantal", 2418f);

		System.out.println("Taille de 'salaryMap': " + salaryMap.size());
		System.out.println();

		Map<Integer, String> cityMap = new HashMap<>();
		cityMap.put(13, "Marseille");
		cityMap.put(34, "Montpellier");
		cityMap.put(44, "Nantes");
		cityMap.put(75, "Paris");
		cityMap.put(31, "Toulouse");
		
		cityMap.put(59, "Lille");
		cityMap.put(33, "Lyon");
		
		for (int department : cityMap.keySet()) {
			String city = cityMap.get(department);
			System.out.println(city + " (" + department + ")");
		}
		System.out.println();
		
		System.out.println("Taille de 'cityMap': " + cityMap.size());

	}

}

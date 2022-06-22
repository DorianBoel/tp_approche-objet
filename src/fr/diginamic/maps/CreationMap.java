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
		
		System.out.println("Taille de la map: " + salaryMap.size());
		
	}

}

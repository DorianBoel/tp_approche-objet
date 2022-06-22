package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

public class FusionMap {
	
	public static void main(String args[]) {
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");

		Map<Integer, String> map2 = new HashMap<>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		Map<Integer, String> map3 = new HashMap<>();
		map3.putAll(map1);
		map3.putAll(map2);
		
		System.out.println("map3:");
		for (int i : map3.keySet()) {
			String color = map3.get(i);
			System.out.println(" " +i + " => " + color);
		}
		
	}
}

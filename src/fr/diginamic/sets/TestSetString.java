package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		
		Set<String> stringSet = new HashSet<>(
			Arrays.asList(
				"USA",
				"France",
				"Allemagne",
				"UK",
				"Italie",
				"Japon",
				"Chine", 
				"Russie", 
				"Inde"
			)
		);
		
		String mostLetters = "";
		for (String str: stringSet) {
			if (str.length() > mostLetters.length()) {
				mostLetters = str;
			}
		}
		System.out.println("Élément du set ayant le plus grand nombre de lettres: " + mostLetters);
		
		if (stringSet.remove(mostLetters)) {
			System.out.println(" On supprime cet élément");
		}
		System.out.println();
		
		System.out.println("Tous les éléments du set: ");
		for (String str : stringSet) {
			System.out.println(" " + str);
		}
		System.out.println();
	}
	
}

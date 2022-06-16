package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>(
			Arrays.asList(
				"Nice",
				"Carcassonne",
				"Narbonne",
				"Lyon",
				"Foix",
				"Pau",
				"Marseille",
				"Tarbes"
			)
		);
		
		System.out.println("Élément de la liste ayant le plus grand nombre de lettres: " + getListLongest(stringList));
		System.out.println();
		
		deleteFromListOnStartingLetter(stringList, "N");
		System.out.println("Tous les éléments de la liste commençant par 'N' sont supprimés");
		System.out.println();
		
		makeListUppercase(stringList);
		System.out.println("Chaque élément de la liste est mis en majuscules");
		System.out.println();
		displayListElements(stringList);

	}
	
	public static <T> void displayListElements(List<T> list) {
		System.out.println("Éléments de la liste:");
		for (T e : list) {
			System.out.println(" " + e);
		}
	}
	
	public static String getListLongest(List<String> list) {
		String longest = "";
		for (String str : list) {
			if (str.length() > longest.length()) {
				longest = str;
			}
		}
		return longest;
	}
	
	public static void deleteFromListOnStartingLetter(List<String> list, String letter) {
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			String str = iter.next();
			if (str.startsWith(letter)) {
				iter.remove();
			}
		}
	}
	
	public static void makeListUppercase(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toUpperCase());
		}
	}

}

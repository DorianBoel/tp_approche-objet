package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<>();
		
		for (int i = 1; i <= 100; i++) {
			intList.add(i);
		}
		
		System.out.println("Taille de la liste 'intList': " + intList.size());
		
	}

}

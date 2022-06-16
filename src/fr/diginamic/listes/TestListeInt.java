package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		
		displayListElements(intList);
		System.out.println();
		
		System.out.println("Taille de la liste: " + intList.size());
		System.out.println();
		
		System.out.println("Valeur maximum dans la liste : " + getListMax(intList));
		System.out.println();
		
		System.out.println("Valeur minimum supprimée de la liste : " + popListMin(intList));
		System.out.println();
		
		displayListElements(intList);
		System.out.println();
		
		makeListPositive(intList);
		System.out.println("Chaque élément négatif de la liste est converti en son opposé");
		displayListElements(intList);
		System.out.println();
	}
	
	public static void displayListElements(List<Integer> list) {
		System.out.println("Éléments de la liste:");
		for (int i : list) {
			System.out.println(i);
		}
	}
	
	public static int getListMax(List<Integer> list) {
		int maxValue = (int) Double.NEGATIVE_INFINITY;
		for (int i : list) {
			if (i > maxValue) {
				maxValue = i;
			}
		}
		return maxValue;
	}
	
	public static int popListMin(List<Integer> list) {
		int minValue = (int) Double.POSITIVE_INFINITY;
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < minValue) {
				index = i;
				minValue = list.get(i);
			}
		}
		list.remove(index);
		return minValue;
	}
	
	public static void makeListPositive(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 0) {
				list.set(i, -list.get(i));
			}
		}
	}

}

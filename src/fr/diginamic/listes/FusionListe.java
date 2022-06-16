package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String args[]) {

		List<String> list1 = new ArrayList<>();

		list1.add("Rouge");
		list1.add("Vert");
		list1.add("Orange");

		List<String> list2 = new ArrayList<>();

		list2.add("Blanc");
		list2.add("Bleu");
		list2.add("Orange");
		
		List<String> list3 = fuseLists(list1, list2);
		
		for (String str : list3) {
			System.out.println(str);
		}

	}
	
	public static List<String> fuseLists(List<String> ...lists) {
		List<String> newList = new ArrayList<>();
		for (List<String> list : lists) {
			for (String str : list) {
				newList.add(str);
			}
		}
		return newList;
	}

}
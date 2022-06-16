package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListObject {
	
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
		
		System.out.println("La ville ayant le plus grand nombre d'habitants dans la liste est " + getListMostPopulation(cityList).getName());
		System.out.println();
		
		System.out.println("La ville ayant le plus petit nombre d'habitants est supprimée de la liste: " + popListLeastPopulation(cityList).getName());
		System.out.println();
		
		makeNameUppercaseHigherPopulation(cityList, 100_000);
		System.out.println("Le nom de chaque ville de plus de 100 000 habitants dans la liste est mis en majuscules");
		System.out.println();
		
		System.out.println("Éléments de la liste:");
		for (City city : cityList) {
			city.displayInfo();
		}
		
	}
	
	public static City getListMostPopulation(List<City> list) {
		City result = list.get(0);
		for (City city : list) {
			if (city.getPopulation() > result.getPopulation()) {
				result = city;
			}
		}
		return result;
	}
	
	public static City popListLeastPopulation(List<City> list) {
		City result = list.get(0);
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPopulation() < result.getPopulation()) {
				index = i;
				result = list.get(i);
			}
		}
		list.remove(index);
		return result;
	}
	
	public static void makeNameUppercaseHigherPopulation(List<City> list, int population) {
		for (City city : list) {
			if (city.getPopulation() > population) {
				city.setName(city.getName().toUpperCase());
			}
		}
	}
	
}

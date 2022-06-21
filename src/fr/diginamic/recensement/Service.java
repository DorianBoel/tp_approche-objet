package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Service {

	// Class methods
	public static void displayCityPopulation(Census census, Scanner scanner) {
		DisplayService.displayMessage("city-prompt");
		String searchTerm = PromptService.acceptInput(scanner);
		if (searchTerm.strip().equals("")) {
			displayMenu();
			return;
		}
		List<City> results = Search.findCityByName(searchTerm, census.getCityList());
		if (results.size() == 0) {
			DisplayService.displayMessage("no-result");
			displayCityPopulation(census, scanner);
			return;
		}
		DisplayService.displayCityResults(results);
		DisplayService.displayMessage("menu-opt-1");
	}
	
	public static void start() {
		DisplayService.displayMessage("start");
		displayMenu();
	}
	
	public static void displayMenu() {
		DisplayService.displayMessage("menu");
	}
	
	public static void displayDepartmentPopulation(Census census, Scanner scanner) {
		DisplayService.displayMessage("department-prompt");
		String code = PromptService.acceptInput(scanner);
		if (code.strip().equals("")) {
			displayMenu();
			return;
		}
		Department departement = Search.findDepartment(code, census.getDepartmentList());
		if (departement == null) {
			DisplayService.displayMessage("no-department");
			displayDepartmentPopulation(census, scanner);
			return;
		}
		System.out.println(departement.toString());
		System.out.println();
		DisplayService.displayMessage("menu-opt-2");
	}
	
	public static void displayRegionPopulation(Census census, Scanner scanner, boolean displayList) {
		if (displayList) {
			System.out.println("Veuillez sélectionner une région (Appuyer sur retour pour annuler)");
			System.out.println();
		}
		List<String> indexList = new ArrayList<>();
		Collections.sort(census.getRegionList(), new RegionNameComparator());
		for (int i = 0; i < census.getRegionList().size(); i++) {
			if (displayList) {				
				System.out.println(" " + (i + 1) + ". " + census.getRegionList().get(i).getName());
			}
			indexList.add(String.valueOf(i + 1));
		}
		System.out.println();
		String regionSelect = PromptService.acceptInput(scanner); 
		if (regionSelect.strip().equals("")) {
			displayMenu();
			return;
		}
		if (!indexList.contains(regionSelect)) {
			System.out.println("Option invalide");
			System.out.println();
			displayRegionPopulation(census, scanner, false);
			return;
		}
		int index = Integer.parseInt(regionSelect) - 1;
		System.out.println(census.getRegionList().get(index).toString());
		System.out.println();
		DisplayService.displayMessage("menu-opt-3");
	}
	
	public static void displayRegionTop10(Census census) {
		System.out.println("Les 10 régions de France les plus peuplées:");
		Collections.sort(census.getRegionList(), new RegionPopulationComparator());
		for (int i = 0; i < 10; i++) {
			System.out.println(" " + (i + 1) + ". " + census.getRegionList().get(i).toString());
		}
		System.out.println();
		DisplayService.displayMessage("menu-opt");
	}
	
	public static void displayDepartmentTop10(Census census) {
		System.out.println("Les 10 départements de France les plus peuplés:");
		Collections.sort(census.getDepartmentList(), new DepartmentPopulationComparator());
		for (int i = 0; i < 10; i++) {
			System.out.println(" " + (i + 1) + ". " + census.getDepartmentList().get(i).toString());
		}
		System.out.println();
		DisplayService.displayMessage("menu-opt");
	}
	
	public static void displayCityTop10(Census census) {
		System.out.println("Les 10 villes de France les plus peuplées:");
		Collections.sort(census.getCityList(), new CityPopulationComparator());
		for (int i = 0; i < 10; i++) {
			System.out.println(" " + (i + 1) + ". " + census.getCityList().get(i).toString());
		}
		System.out.println();
		DisplayService.displayMessage("menu-opt");
	}
	
	public static void displayDepartmentCityTop10(Census census, Scanner scanner) {
		DisplayService.displayMessage("department-prompt");
		String code = PromptService.acceptInput(scanner);
		if (code.strip().equals("")) {
			displayMenu();
			return;
		}
		Department department = Search.findDepartment(code, census.getDepartmentList());
		if (department == null) {
			DisplayService.displayMessage("no-department");
			displayDepartmentPopulation(census, scanner);
			return;
		}
		Collections.sort(department.getCities(), new CityPopulationComparator());
		System.out.println("Les 10 villes les plus peuplées dans le département " + department.getCode() + " :");
		for (int i = 0; i < 10; i++) {
			System.out.println(" " + (i + 1) + ". " + department.getCities().get(i).toString());	
		}
		System.out.println();
		DisplayService.displayMessage("menu-opt-6");
	}
	
	public static void displayRegionCityTop10(Census census, Scanner scanner, boolean displayList) {
		if (displayList) {
			System.out.println("Veuillez sélectionner une région (Appuyer sur retour pour annuler):");
			System.out.println();
		}
		List<String> indexList = new ArrayList<>();
		Collections.sort(census.getRegionList(), new RegionNameComparator());
		for (int i = 0; i < census.getRegionList().size(); i++) {
			if (displayList) {				
				System.out.println(" " + (i + 1) + ". " + census.getRegionList().get(i).getName());
			}
			indexList.add(String.valueOf(i + 1));
		}
		System.out.println();
		String regionSelect = PromptService.acceptInput(scanner); 
		if (regionSelect.strip().equals("")) {
			displayMenu();
			return;
		}
		if (!indexList.contains(regionSelect)) {
			System.out.println("Option invalide");
			System.out.println();
			displayRegionPopulation(census, scanner, false);
			return;
		}
		int index = Integer.parseInt(regionSelect) - 1;
		Region region = census.getRegionList().get(index);
		List<City> cities = census.getRegionList().get(index).getCities();
		Collections.sort(cities, new CityPopulationComparator());
		System.out.println("Les 10 villes les plus peuplées dans la région " + region.getName() + " :");
		for (int i = 0; i < 10; i++) {
			System.out.println(" " + (i + 1) + ". " + cities.get(i).toString());	
		}
		System.out.println();
		DisplayService.displayMessage("menu-opt-7");
	}
	
	public static void defaultOption() {
		DisplayService.displayMessage("invalid");
	}
	
	public static void exit() {
		DisplayService.displayMessage("exit");
	}
	
}

package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainService {

	// Class methods
	public static void start() {
		DisplayService.displayMessage("start");
		displayMenu();
	}
	
	public static void displayMenu() {
		DisplayService.displayMessage("menu");
	}
	
	public static void getCityPopulation(Census census, Scanner scanner) throws CancelSearchException, CityNoResultsException {
		List<City> results = SecondaryService.searchCity(census.getCityList(), scanner);
		try {
			if (results.size() == 0) {
				DisplayService.displayMessage("no-result");
				throw new CityNoResultsException();
			}
			SecondaryService.displayCityResults(results);
		} catch(CityNoResultsException e) {
			getCityPopulation(census, scanner);
		}
	}
	
	public static void displayDepartmentPopulation(Census census, Scanner scanner) throws CancelSearchException {
		Department department = SecondaryService.searchDepartment(census.getDepartmentList(), scanner);
		try {
			if (department == null) {
				DisplayService.displayMessage("no-department");
				throw new CityNoResultsException();
			}
			DisplayService.displayMessage("display-string", department.toString());
			DisplayService.displayMessage("menu-opt-2");
		} catch(CityNoResultsException e) {
			displayDepartmentPopulation(census, scanner);
		}
	}
	
	public static void displayRegionPopulation(Census census, Scanner scanner, boolean displayList) throws NumberFormatException, CancelSearchException, CityNoResultsException {
		List<Region> regions = census.getRegionList();
		if (displayList) {
			SecondaryService.displayRegionList(regions);
		}
		String regionSelect = SecondaryService.selectRegion(scanner);
		try {
			int index = Integer.parseInt(regionSelect) - 1;
			if (index < 0 || index >= regions.size()) {
				defaultOption();
				throw new CityNoResultsException();
			}
			DisplayService.displayMessage("display-string", regions.get(index).toString());
			DisplayService.displayMessage("menu-opt-3");
		} catch(NumberFormatException | CityNoResultsException e) {
			displayRegionPopulation(census, scanner, false);
		}
	}
	
	public static void displayRegionTop10(Census census) {
		DisplayService.displayMessage("region-top-10");
		List<Region> regions = new ArrayList<>(census.getRegionList());
		Collections.sort(regions, new RegionPopulationComparator());
		for (int i = 0; i < 10; i++) {
			DisplayService.displayListLine(i + 1, regions.get(i).toString());
		}
		System.out.println();
		DisplayService.displayMessage("menu-opt");
	}
	
	public static void displayDepartmentTop10(Census census) {
		DisplayService.displayMessage("department-top-10");
		List<Department> departments = new ArrayList<>(census.getDepartmentList());
		Collections.sort(departments, new DepartmentPopulationComparator());
		for (int i = 0; i < 10; i++) {
			DisplayService.displayListLine(i + 1, departments.get(i).toString());
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
	
	public static void displayDepartmentCityTop10(Census census, Scanner scanner) throws CancelSearchException {
		Department department = SecondaryService.searchDepartment(census.getDepartmentList(), scanner);
		if (department == null) {
			DisplayService.displayMessage("no-department");
			displayDepartmentCityTop10(census, scanner);
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
			displayRegionCityTop10(census, scanner, displayList);
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

package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondaryService {
	
	public static List<City> searchCity(List<City> cityList, Scanner scanner) throws CancelSearchException {
		DisplayService.displayMessage("city-prompt");
		String searchTerm = PromptService.acceptInput(scanner);
		if (searchTerm.strip().equals("")) {
			throw new CancelSearchException();
		}
		return Search.findCityByName(searchTerm, cityList);
	}
	
	public static Department searchDepartment(List<Department> list, Scanner scanner) throws CancelSearchException {
		DisplayService.displayMessage("department-prompt");
		String code = PromptService.acceptInput(scanner);
		if (code.strip().equals("")) {
			throw new CancelSearchException();
		}
		return Search.findDepartment(code, list);
	}
	
	public static String selectRegion(Scanner scanner) throws CancelSearchException {
		String regionSelect = PromptService.acceptInput(scanner); 
		if (regionSelect.strip().equals("")) {
			throw new CancelSearchException();
		}
		return regionSelect;
	}
	
	public static void displayRegionList(List<Region> regionList) {
		DisplayService.displayMessage("region-prompt");
		Collections.sort(regionList, new RegionNameComparator());
		for (int i = 0; i < regionList.size(); i++) {				
			DisplayService.displayListLine(i + 1, regionList.get(i).getName());
		}
		DisplayService.displayMessage("display-string", "");
	}
	
	public static void displayCityResults(List<City> results) {
		if (results.size() == 1) {
			DisplayService.displayMessage("single-result", results);
			DisplayService.displayMessage("menu-opt-1");
			return;
		}
		int resultsLimit = results.size() > 10 ? 10 : results.size();
		DisplayService.displayMessage("results-total", String.valueOf(results.size()));
		if (results.size() > 10) {
			DisplayService.displayMessage("first-10");
		}
		for (int i = 0; i < resultsLimit; i++) {
			DisplayService.displayListLine(i + 1, results.get(i).toString());
		}
		System.out.println();
		DisplayService.displayMessage("menu-opt-1");
	}
	
}

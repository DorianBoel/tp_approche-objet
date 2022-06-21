package fr.diginamic.recensement;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		
		
		Census census = Census.getInstance();
		List<City> cities = census.getCityList();
		List<Department> departments = census.getDepartmentList();
		List<Region> regions = census.getRegionList();
		
		Scanner menuPrompt = new Scanner(System.in);
		String menuSelect = "0";
		
		Service.start();
		
		while (!menuSelect.equals("9")) {
			menuSelect = menuPrompt.nextLine();
			switch (menuSelect) {
				case ("M") :
					Service.displayMenu();
					break;
				case ("1") :
					Service.displayCityPopulation(census, menuPrompt);
					break;
				case ("2") :
					Service.displayDepartmentPopulation(census, menuPrompt);
					break;
				case ("3") :
					Service.displayRegionPopulation(census, menuPrompt, true);
					break;
				case ("4") :
					Service.displayRegionTop10(census);
					break;
				case ("5") :
					Service.displayDepartmentTop10(census);
					break;
				case ("6") :
					Service.displayDepartmentCityTop10(census, menuPrompt);
					break;
				case ("7") :
					Service.displayRegionCityTop10(census, menuPrompt, true);
					break;
				case ("8") :
					Service.displayCityTop10(census);
					break;
				case ("9") :
					Service.exit();
				 	break;
				default :
					Service.defaultOption();
			}
			
		}
		menuPrompt.close();
		
		/*List<City> results = Search.findCityByName("m", cities);
		Collections.sort(cities, new CityPopulationComparator());
		int searchLimit = results.size() < 10 ? results.size() : 10;
		for (int i = 0; i < searchLimit; i++) {
			System.out.println((i + 1) + " - " + cities.get(i).toString());
			System.out.println();
		}
		int remaining = results.size() - searchLimit;
		if (remaining > 0) {
			System.out.println("(" + remaining + " autres résultats)");
			System.out.println();
		}*/
		
		//System.out.println(Search.findDepartment("7", departments).getRegionCode());
		
		/*for (Region region : regions) {
			System.out.println(region.getName());
		}*/

	}

}

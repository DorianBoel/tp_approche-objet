package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		Path pathFile = FileAccess.PATH_FILE;
		
		List<String> lines = FileAccess.getLines(pathFile);
		
		System.out.println("Contenu du fichier '" + pathFile.getName(pathFile.getNameCount() - 1) + "' :");
		System.out.println();
		boolean elipsis = false;
		for (int i = 0; i < lines.size(); i++) {
			if (i < 10 || i > lines.size() - 10) {					
				System.out.println(lines.get(i));
			} else {
				if (!elipsis) {
					System.out.println("(...)");
					elipsis = true;
				}
			}
		}
		System.out.println();
		
		List<City> cityList = new ArrayList<>();
		for (int i = 1; i < lines.size(); i++) {
			String[] dataArray = lines.get(i).split(";");
			String 
				cityName = dataArray[6],
				departmentCode = dataArray[2],
				regionName = dataArray[1]
			;
			int totalPopulation = Integer.parseInt(dataArray[9].replace(" ", ""));
			cityList.add(new City(cityName, departmentCode, regionName, totalPopulation));
		}
		
		System.out.println("Villes enregistrées: " + cityList.size());
		System.out.println();
		
		Path targetPath = Paths.get("/Users/macbook/Desktop/dev/diginamic/files/generated_file.csv");
		
		List<String> citiesWPopulationOver25k = new ArrayList<>();
		citiesWPopulationOver25k.add("Nom de la commune;Code département;Nom de la région;Population totale;");
		for (City city : cityList) {
			if (city.getPopulation() > 25_000) {
				String line = String.join(";",
					city.getName(),
					city.getDepartmentCode(),
					city.getRegion(),
					Integer.toString(city.getPopulation())
				) + ";";
				citiesWPopulationOver25k.add(line);
			}
		}
		
		Files.write(targetPath, citiesWPopulationOver25k);
		
	}

}

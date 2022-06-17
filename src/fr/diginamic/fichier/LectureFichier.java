package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		Path pathFile= Paths.get("/Users/macbook/Desktop/dev/diginamic/files/recensement.csv");
		
		if (Files.exists(pathFile) && !Files.isDirectory(pathFile)) {
			
			List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
			
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
			
		}
			

	}

}

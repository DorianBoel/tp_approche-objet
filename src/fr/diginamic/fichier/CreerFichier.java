package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		
		List<String> lines = FileAccess.getLines(FileAccess.PATH_FILE);
		
		Path targetPath = Paths.get("/Users/macbook/Desktop/dev/diginamic/files/new_file.txt");
		
		List<String> first100 = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			first100.add(lines.get(i));
		}
		
		Files.write(targetPath, first100);

	}

}

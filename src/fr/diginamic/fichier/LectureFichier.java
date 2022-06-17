package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		Path pathFile = FileAccess.PATH_FILE;
		
		if (FileAccess.fileIsValid(pathFile)) {
			
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
			
		}
			

	}

}

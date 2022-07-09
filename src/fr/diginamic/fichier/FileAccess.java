package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileAccess {

	public static final Path PATH_FILE = Paths.get("../../files/recensement.csv");
	
	public static List<String> getLines(Path path) throws IOException {
		return Files.readAllLines(path, StandardCharsets.UTF_8);
	}
	
	public static boolean fileIsValid(Path path) {
		return Files.exists(path) && !Files.isDirectory(path);
	}
	
}

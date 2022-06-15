package fr.diginamic.essais;

import java.util.Scanner;
import fr.diginamic.jdr.Game;

public class TestJDR {

	public static void main(String[] args) {
		
		System.out.println("Démarrage du jeu");
		System.out.println("_________________");
		System.out.println();
		
		Scanner menuPrompt = new Scanner(System.in);
		String menuSelect =  "0";
		Game.displayMenu();
		
		while (!menuSelect.equals("4")) {
			menuSelect = menuPrompt.nextLine();
			
			switch (menuSelect) {
				case ("M") :
					Game.displayMenu();
					break;
				case ("1") :
					if (Game.playerCharIsDefined() && Game.playerCharIsAlive()) {
						String confirmCharacterOverride = "0";
						System.out.println("Votre personnage actuel sera remplacé. Voulez-vous vraiment continuer ? (Y/N)");
						System.out.println();
						while (!confirmCharacterOverride.equals("N") && !confirmCharacterOverride.equals("") && !confirmCharacterOverride.equals("Y")) {
							confirmCharacterOverride = menuPrompt.nextLine();
						}
						if (confirmCharacterOverride.equals("Y")) {
							Game.createCharacter();
						}
						continue;
					}
					Game.createCharacter();
					break;
				case ("2") :
					if (!Game.playerCharIsDefined()) {						
						System.out.println("Veuillez d'abord créer un personnage.");
						System.out.println();
						continue;
					}
					if (!Game.playerCharIsAlive()) {
						Game.displayGameOver();
						continue;
					}
					String monsterSelect = "0";
					
					Game.displayMonsterMenu();
					while (!monsterSelect.toLowerCase().equals("loup") && !monsterSelect.toLowerCase().equals("gobelin") && !monsterSelect.toLowerCase().equals("troll") && !monsterSelect.equals("N") && !monsterSelect.equals("")) {
						monsterSelect = menuPrompt.nextLine();
						switch (monsterSelect.toLowerCase()) {
							case ("loup") :
							case ("gobelin") :
							case ("troll") :
								Game.fight(monsterSelect.toLowerCase());
								break;
							case ("") :
							case ("N") :
								Game.displayMenu();
								continue;
							default :
								System.out.println("Option invalide");
								System.out.println();
						}
					}
					break;
				case ("3") :
					if (!Game.playerCharIsDefined()) {						
						System.out.println("Veuillez d'abord créer un personnage.");
						System.out.println();
						continue;
					}
					Game.displayCharacterInfo();
					break;
				case ("4") :
					String confirmQuit = "0";
					System.out.println("Voulez-vous vraiment quitter le jeu ? (Y/N)");
					System.out.println();
					while (!confirmQuit.equals("N") && !confirmQuit.equals("") && !confirmQuit.equals("Y")) {
						confirmQuit = menuPrompt.nextLine();
					}
					if (confirmQuit.equals("Y")) {
						System.out.println("Arrêt du jeu");
						continue;
					}
					menuSelect = "0";
					break;
				default :
					System.out.println("Option invalide");
					System.out.println();
			}
			
		}
		menuPrompt.close();
		
	}

}

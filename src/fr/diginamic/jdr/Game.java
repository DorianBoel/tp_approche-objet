package fr.diginamic.jdr;

public class Game {

	//Instance attributes
	private static PlayerCharacter playerCharacter;
	private static Monster currentMonster;
	
	//Instance methods
	public static void createCharacter() {
		playerCharacter = new PlayerCharacter();
		System.out.println("Nouveau personnage créé:");
		System.out.println("  PV: " + playerCharacter.getHealth());
		System.out.println("  Force: " + playerCharacter.getStrength());
		System.out.println();
	}
	
	public static void fight(String type) {
		if (playerCharacter.getHealth() <= 0) {
			displayGameOver();
			return;
		}
		currentMonster = new Monster(type);
		System.out.println("Vous engagez le combat contre un " + type + ".");
		System.out.println();
		while (playerCharacter.getHealth() > 0 && currentMonster.getHealth() > 0) {
			fightRound();
		}
		if (playerCharacter.getHealth() <= 0) {
			System.out.println("Le " + currentMonster.getType() + " vous a porté un coup fatal !");
			System.out.println("Vous êtes mort.");
			System.out.println();
			displayGameOver();
			return;
		}
		playerCharacter.addScore(currentMonster.getPoints());
		System.out.println("Vous avez vaincu le " + currentMonster.getType() + " !");
		System.out.println("Votre score actuel est de " + playerCharacter.getScore() + " points.");
		System.out.println("Il vous reste " + playerCharacter.getHealth() + " PV.");
		System.out.println();
		System.out.println("2 pour combattre un nouveau monstre");
		System.out.println("M pour réafficher le menu");
		System.out.println();
	}
	
	private static void fightRound() {
		int playerAttack = playerCharacter.getStrength() + (int) Math.floor(Math.random() * (10 - 1) + 1);
		int monsterAttack = currentMonster.getStrength() + (int) Math.floor(Math.random() * (10 - 1) + 1);
		int diff = playerAttack - monsterAttack;
		if (diff > 0) {
			currentMonster.receiveDamage(diff);
			System.out.println("Vous attaquez le " + currentMonster.getType() + " et lui infligez " + diff + " points de dégâts.");
			System.out.println();
		} else if (diff < 0) {
			diff = -diff;
			playerCharacter.receiveDamage(diff);
			System.out.println("Le " + currentMonster.getType() + " vous attaque et vous inflige " + diff + " points de dégâts.");
			System.out.println();
		} else {
			System.out.println("Le " + currentMonster.getType() + " vous attaque mais vous ne subissez aucun dégâts.");
			System.out.println();
		}
	}
	
	public static void displayMenu() {
		System.out.println("Choisissez une option: ");
		System.out.println(" 1. Créer un nouveau personnage");
		System.out.println(" 2. Combattre un monstre");
		System.out.println(" 3. Afficher les infos du personnage");
		System.out.println(" 4. Quitter le jeu");
		System.out.println();
		System.out.println("M pour réafficher ce menu");
		System.out.println();
	}
	
	public static void displayMonsterMenu() {
		System.out.println("Choisissez quel monstre combattre (loup/gobelin/troll)");
		System.out.println(" Loup: PV 5-10, Force 3-8, +1 point si vaincu");
		System.out.println(" Gobelin: PV 10-15, Force 5-10, +2 points si vaincu");
		System.out.println(" Troll: PV 20-30, Force 10-15, +5 points si vaincu");
		System.out.println();
		System.out.println("N pour annuler");
		System.out.println();
	}
	
	public static void displayCharacterInfo() {
		System.out.println("Personnage actuel:");
		System.out.println("  PV: " + playerCharacter.getHealth());
		System.out.println("  Force: " + playerCharacter.getStrength());
		System.out.println("  Score actuel: " + playerCharacter.getScore());
		System.out.println();
	}
	
	public static void displayGameOver() {
		System.out.println("-- GAME OVER --");
		System.out.println("Score final obtenu: " + playerCharacter.getScore() + " points");
		System.out.println("Créez un nouveau personnage pour commencer une nouvelle partie.");
		System.out.println();
	}
	
	public static boolean playerCharIsDefined() {
		return playerCharacter != null;
	}
	
	public static boolean playerCharIsAlive() {
		return playerCharacter.getHealth() > 0;
	}
	
}

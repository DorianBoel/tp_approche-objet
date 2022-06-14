package fr.diginamic.essais;

import fr.diginamic.salaire.Contributor;
import fr.diginamic.salaire.Freelance;
import fr.diginamic.salaire.Salaried;

public class TestIntervenant {

	public static void main(String[] args) {

		Salaried salaried = new Salaried("Fontaine", "Mathilde", 2300f);
		Freelance freelance = new Freelance("Dupuis", "François", 30, 100f);
		
		for (Contributor contributor : new Contributor[] {salaried, freelance}) {
			contributor.displayInfo();
		}

	}

}

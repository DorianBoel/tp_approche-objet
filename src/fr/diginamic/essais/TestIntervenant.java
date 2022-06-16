package fr.diginamic.essais;

import fr.diginamic.salaire.Contributor;
import fr.diginamic.salaire.Freelance;
import fr.diginamic.salaire.Salaried;

public class TestIntervenant {

	public static void main(String[] args) {

		Contributor salaried = new Salaried("Fontaine", "Mathilde", 2300f);
		Contributor freelance = new Freelance("Dupuis", "François", 30, 100f);
		
		for (Contributor contributor : new Contributor[] {salaried, freelance}) {
			contributor.displayInfo();
		}

	}

}

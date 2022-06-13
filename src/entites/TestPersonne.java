package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adresse1 = new AdressePostale(5, "avenue Ferdinand de Lesseps", 38000, "Grenoble");
		AdressePostale adresse2 = new AdressePostale(71, "rue Pierre de Coubertin", 31100, "Toulouse");
		
		Personne personne1 = new Personne("Lavallée", "Arthur");
		Personne personne2 = new Personne("Grivaud", "Laure");
		
		personne1.setAddress(adresse1);
		personne2.setAddress(adresse2);
		
		
	}
	
}

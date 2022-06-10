package entites;

import entites2.Personne;

public class TestPersonne {

	static void main() {

		AdressePostale adresse1 = new AdressePostale(5, "avenue Ferdinand de Lesseps", 38000, "Grenoble");
		AdressePostale adresse2 = new AdressePostale(71, "rue Pierre de Coubertin", 31100, "Toulouse");
		
		Personne personne1 = new Personne("Lavallée", "Arthur", adresse1);
		Personne personne2 = new Personne("Grivaud", "Laure", adresse2);
		
	}
	
}

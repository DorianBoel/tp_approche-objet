package entites;

import entites2.Personne;

public class TestPersonne {

	static void main() {

		AdressePostale adresse1 = new AdressePostale();
		AdressePostale adresse2 = new AdressePostale();
		
		adresse1.numeroDeRue = 5;
		adresse1.libelleDeRue = "avenue Ferdinand de Lesseps";
		adresse1.codePostal = 38000;
		adresse1.ville = "Grenoble";
		
		adresse2.numeroDeRue = 71;
		adresse2.libelleDeRue = "rue Pierre de Coubertin";
		adresse2.codePostal = 31100;
		adresse2.ville = "Toulouse";
		
		Personne personne1 = new Personne();
		Personne personne2 = new Personne();
		
		personne1.nom = "Lavallée";
		personne1.prenom = "Arthur";
		personne1.adresse = adresse1;
		
		personne2.nom = "Grivaud";
		personne2.prenom = "Laure";
		personne2.adresse = adresse2;
		
	}
	
}

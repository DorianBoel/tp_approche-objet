package entites2;

import entites.AdressePostale;

public class Personne {
	
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.displayName();
	}
	
	public void direBonjour() {
		System.out.println("Bonjour, je m'appelle "+this.prenom+" "+this.nom);
	}
	
	public void displayName() {
		System.out.println(this.nom.toUpperCase() + " " + this.prenom);
	}
	
	public String getLastName() {
		return this.nom;
	}
	
	public String getFirstName() {
		return this.prenom;
	}
	
	public AdressePostale getAddress() {
		return this.adresse;
	} 
	
	public void setLastName(String lastName) {
		this.nom = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.prenom = firstName;
	}
	
	public void setAddress(AdressePostale address) {
		this.adresse = address;
	}
}

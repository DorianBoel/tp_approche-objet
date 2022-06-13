package fr.diginamic.banque.entites;

public class Compte {
	
	//Instance attributes
	private long numero;
	private float solde;
	
	//Constructor
	public Compte(long numero, float solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	//Instance methods
	@Override
	public String toString() {
		return "Numéro de compte: " + this.numero + ", Solde: " + this.solde + "€";
	}

	//Getters
	public long getNumero() {
		return numero;
	}

	public float getSolde() {
		return solde;
	}

	//Setters
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
}

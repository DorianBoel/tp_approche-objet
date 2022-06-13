package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	//Instance attribute
	private float tauxRemuneration;
	
	//Constructor
	public CompteTaux(long numero, float solde, float taux) {
		super(numero, solde);
		this.tauxRemuneration = taux; 
	}
	
	//Instance methods
	@Override
	public String toString() {
		return super.toString() + ", Taux de rémunération: " + this.tauxRemuneration + "%";
	}

	//Getters
	public float getTauxRemuneration() {
		return tauxRemuneration;
	}
	
	//Setters
	public void setTauxRemuneration(float tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}

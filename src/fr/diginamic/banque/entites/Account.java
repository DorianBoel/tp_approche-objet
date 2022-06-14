package fr.diginamic.banque.entites;

public class Account {
	
	//Instance attributes
	protected long number;
	protected float balance;
	
	//Constructor
	public Account(long number, float balance) {
		this.number = number;
		this.balance = balance;
	}
	
	//Instance methods
	@Override
	public String toString() {
		return "Numéro de compte: " + this.number + ", Solde: " + this.balance + "€";
	}

	//Getters
	public long getNumber() {
		return number;
	}

	public float getBalance() {
		return balance;
	}

	//Setters
	public void setNumber(long number) {
		this.number = number;
	}
	
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
}

package fr.diginamic.banque.entites;

public class RateAccount extends Account {
	
	//Instance attribute
	private float payRate;
	
	//Constructor
	public RateAccount(long number, float balance, float rate) {
		super(number, balance);
		this.payRate = rate; 
	}
	
	//Instance methods
	@Override
	public String toString() {
		return super.toString() + ", Taux de rémunération: " + this.payRate + "%";
	}

	//Getters
	public float getPayRate() {
		return this.payRate;
	}
	
	//Setters
	public void setPayRate(float rate) {
		this.payRate = rate;
	}
}

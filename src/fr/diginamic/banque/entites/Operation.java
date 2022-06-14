package fr.diginamic.banque.entites;

public abstract class Operation {
	
	//Instance attributes
	protected String date;
	protected float amount;
	
	//Constructor
	public Operation(String date, float amount) {
		this.date = date;
		this.amount = amount;
	}
	
	//Abstract methods
	public abstract String getType();

	//Getters
	public String getDate() {
		return date;
	}

	public float getAmount() {
		return amount;
	}

	//Setters
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
}

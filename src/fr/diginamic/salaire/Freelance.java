package fr.diginamic.salaire;

public class Freelance extends Contributor {

	//Instance attributes
	private int workDays;
	private float dailyIncome;
	
	//Constructor
	public Freelance(String lastName, String firstName, int days, float dailyIncome) {
		super(lastName, firstName);
		this.workDays = days;
		this.dailyIncome = dailyIncome;
	}
	
	//Instance methods
	public float getSalary() {
		return (float) this.workDays * this.dailyIncome;
	}
	
	public void displayInfo() {
		System.out.println(this.getLastName().toUpperCase() + " " + this.getFirstName() + ", Pigiste, Salaire: " + this.getSalary() + "€");
	}
	
	//Getters
	public int getWorkDays() {
		return this.workDays;
	}
	
	public int getDailyIncome() {
		return this.workDays;
	}

	//Setters
	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}
	
	public void setDailyIncome(float dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
}

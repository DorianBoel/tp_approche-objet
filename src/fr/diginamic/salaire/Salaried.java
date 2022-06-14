package fr.diginamic.salaire;

public class Salaried extends Contributor {

	//Instance attributes
	private float salary;
	
	//Constructor
	public Salaried(String lastName, String firstName, float salary) {
		super(lastName, firstName);
		this.salary = salary;
	}
	
	//Instance methods
	public void displayInfo() {
		System.out.println(this.getLastName().toUpperCase() + " " + this.getFirstName() + ", Salarié(e), Salaire: " + this.getSalary() + "€");
	};
	
	//Getters
	public float getSalary() {
		return this.salary;
	}

	//Setters
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}

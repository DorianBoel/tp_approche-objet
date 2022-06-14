package fr.diginamic.entites;

public class Employee {
	
	//Instance attributes
	private String lastName;
	private String firstName;
	private double salary;
	
	//Constructor
	public Employee(String lastName, String firstName, double salary) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
	}
	
	//Instance methods
	@Override
	public String toString(){
		return this.lastName.toUpperCase() + " " + this.firstName + ", Salaire mensuel: " + this.salary + "€";
	}

	//Getters
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public double getSalary() {
		return salary;
	}

	//Setters
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

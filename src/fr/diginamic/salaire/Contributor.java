package fr.diginamic.salaire;

public abstract class Contributor {

	//Instance attributes
	protected String lastName;
	protected String firstName;
	
	//Constructor
	public Contributor(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	//Abstract methods
	public abstract float getSalary();
	public abstract void displayInfo();

	//Getters
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	//Setters
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}

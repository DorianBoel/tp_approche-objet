package fr.diginamic.entites;

public class Theater {

	//Instance attributes
	private String name;
	private int maxCapacity;
	private int registeredPeople = 0;
	private float totalIncome = 0f;
	
	//Constructor
	public Theater(String name, int maxCapacity) {
		this.name = name;
		this.maxCapacity = maxCapacity;
	}
	
	//Class methods
	public void register(int people, float price) {
		if (this.registeredPeople + people > this.maxCapacity) {
			System.out.println("Inscription annulée: Pas assez de places disponibles.");
		} else {
			this.registeredPeople += people;
			this.totalIncome += people * price;
			System.out.println("Personnes inscrites: " + people + ", places restantes: " + (this.maxCapacity - this.registeredPeople));
		}
	}
	
	//Getters
	public String getName() {
		return name;
	}
	
	public int getMaxCapacity() {
		return maxCapacity;
	}
	
	public int getRegisteredPeople() {
		return registeredPeople;
	}
	
	public float getTotalIncome() {
		return totalIncome;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	
}

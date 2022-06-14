package fr.diginamic.essais;

import fr.diginamic.entites.Theater;

public class TestTheatre {

	public static void main(String[] args) {
		
		float price = 15f;
		
		Theater theater1 = new Theater("Théâtre Molière", 500);
		
		for (int i = 1; i < 20; i++) {
			theater1.register(i * 10, price);
		}
		
		System.out.println("Total des personnes inscrites: " + theater1.getRegisteredPeople());
		System.out.println("Total des revenus: " + theater1.getTotalIncome() + "€");
		
	}

}

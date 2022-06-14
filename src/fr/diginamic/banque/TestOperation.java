package fr.diginamic.banque;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;

public class TestOperation {

	public static void main(String[] args) {
		
		Credit operation1 = new Credit("11/06/2021", 3000.0f);
		Debit operation2 = new Debit("02/08/2021", 1899.99f);
		Credit operation3 = new Credit("22/12/2021", 200.0f);
		Debit operation4 = new Debit("09/02/2022", 989.99f);
		
		Operation[] operationArr = {
			operation1,
			operation2,
			operation3,
			operation4
		};
		
		float totalAmount = 0.0f;
		
		System.out.println("Total: " + totalAmount + "€");
		System.out.println();
		
		for (Operation operation : operationArr) {
			String type = operation.getType().toLowerCase();
			type = Character.toUpperCase(type.charAt(0)) + type.substring(1).replace("e", "é");
			
			System.out.println(type + " effectué le " + operation.getDate() + ", montant: " + operation.getAmount() + "€");
			
			if (operation.getType().equals("CREDIT")) {
				totalAmount += operation.getAmount();
			} else {
				totalAmount -= operation.getAmount();
			}
			
			System.out.println("Total: " + totalAmount + "€");
			System.out.println();
		}
	}

}

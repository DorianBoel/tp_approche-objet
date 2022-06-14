package fr.diginamic.chaines;

import fr.diginamic.entites.Employee;

public class StringOperator {
	
	public static void main(String[] args) {
				
		String str = "Durand;Marcel;2 523.5";
		
		System.out.println("Premier caractère: " + str.charAt(0));
		System.out.println("Nombre de caractères: " + str.length());
		System.out.println("Index du premier ';': " + str.indexOf(';'));
		
		String lastName = str.substring(0, str.indexOf(';'));
		System.out.println("Nom de famille: " + lastName);
		System.out.println("Nom de famille majuscules: " + lastName.toUpperCase());
		System.out.println("Nom de famille minuscules: " + lastName.toLowerCase());
		
		String[] strSplit = str.split(";");
		
		String message1 = "Tableau séparant les valeurs: {";

		for (int i = 0; i < strSplit.length; i++) {
			if (i == strSplit.length - 1) {
				message1 += strSplit[i];
			} else {
				message1 += strSplit[i] + ", ";
			}			
		}
		
		message1 += "}";
		System.out.println(message1);
		
		Employee employee1 = new Employee(strSplit[0], strSplit[1], Double.parseDouble(strSplit[2].replace(" ", "")));
		
		System.out.println(employee1.toString());
		
	}

}

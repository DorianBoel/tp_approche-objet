package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte compte1 = new Compte(1, 6943.45f);
		
		CompteTaux compte2 = new CompteTaux(2, 4521.78f, 5);
		
		Compte[] accountArr = {compte1, compte2};
		
		for (Compte account : accountArr) {
			System.out.println(account.toString());
		}
		
	}

}

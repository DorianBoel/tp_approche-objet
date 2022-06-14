package fr.diginamic.banque;

import fr.diginamic.banque.entites.Account;
import fr.diginamic.banque.entites.RateAccount;

public class TestBanque {

	public static void main(String[] args) {
		
		Account account1 = new Account(1, 6943.45f);
		
		RateAccount account2 = new RateAccount(2, 4521.78f, 5);
		
		Account[] accountArr = {
			account1,
			account2
		};
		
		for (Account account : accountArr) {
			System.out.println(account.toString());
		}
		
	}

}

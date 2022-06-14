package fr.diginamic.banque.entites;

public class Debit extends Operation {
	
	//Constructor
	public Debit(String date, float amount) {
		super(date, amount);
	}
	
	//Instance methods
	@Override
	public String getType() {
		return "DEBIT";
	}
}

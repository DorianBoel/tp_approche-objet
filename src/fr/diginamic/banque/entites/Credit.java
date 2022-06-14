package fr.diginamic.banque.entites;

public class Credit extends Operation {
	
	//Constructor
	public Credit(String date, float amount) {
		super(date, amount);
	}

	//Instance methods
	@Override
	public String getType() {
		return "CREDIT";
	}
}

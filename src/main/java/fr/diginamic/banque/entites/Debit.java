package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateO, int montO) 
	{
		super(dateO, montO);
		
	}

	public String getType()
	{
		return "DEBIT";
	}
	
}

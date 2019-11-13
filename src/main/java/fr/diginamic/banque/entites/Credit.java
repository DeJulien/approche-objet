package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateO, int montO) 
	{
		super(dateO, montO);
		
	}
	
	public String getType()
	{
		return "CREDIT";
	}

}

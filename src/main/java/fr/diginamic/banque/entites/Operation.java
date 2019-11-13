package fr.diginamic.banque.entites;

public abstract class  Operation {

	String dateOperation;
	int montantOperation;
	
	public Operation(String dateO, int montO)
	{
		this.dateOperation=dateO;
		this.montantOperation=montO;
		
	}
	
	public int getOpe()
	{
		return this.montantOperation;
	}
	
	abstract String getType();
	
}

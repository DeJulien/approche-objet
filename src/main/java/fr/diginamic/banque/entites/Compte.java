package fr.diginamic.banque.entites;

public class Compte {
	
	public int numCompte;
	public int soldeCompte;
	
	public Compte(int numC, int soldC)
	{
		this.numCompte=numC;
		this.soldeCompte=soldC;
	}
	
	public String toString()
	{
		return "numero de solde : "+this.numCompte+"\nsolde de compte : "+soldeCompte;
	}

}

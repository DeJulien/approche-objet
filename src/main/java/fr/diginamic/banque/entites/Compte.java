package fr.diginamic.banque.entites;

public class Compte {
	
	public int numCompte;
	public double soldeCompte;
	
	public Compte(int numC, double soldC)
	{
		this.numCompte=numC;
		this.soldeCompte=soldC;
	}
	
	public String toString()
	{
		return "numero de solde : "+this.numCompte+"\nsolde de compte : "+soldeCompte;
	}
	
	public double getSolde()
	{
		return soldeCompte;
	}
	
	public double calculeTaux()
	{
		return soldeCompte;
	}

}

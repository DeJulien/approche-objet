package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	
	
	public int tauxRenumeration;
	
	public CompteTaux(int numCompte, int soldeCompte, int tauxRen)
	{
		super (numCompte,soldeCompte);
		this.tauxRenumeration=tauxRen;
	}
	
	public String toString()
	{
		return super.toString()+"\nTaux de rénumeration :"+this.tauxRenumeration;
	}
	
	public int getTaux()
	{
		return this.tauxRenumeration;
	}
	
	public double calculeTaux()
	{
		return super.calculeTaux()+(super.calculeTaux()*this.tauxRenumeration)/100;
	}

}

package fr.diginamic.banque.entites;

public class Compte {
	
	public int numCompte;
	public double soldeInitial;
	public Operation tab[]=new Operation[10];
	public int compteur;
	
	public Compte(int numC, double soldC)
	{
		this.numCompte=numC;
		this.soldeInitial=soldC;
	}
	
	public String toString()
	{

		return "numero de solde : "+this.numCompte+"\nsolde de compte initial : "+soldeInitial+"\nvous avez effectué :"+compteur+" operation sur se compte"
				;
	}
	
	
	public double calculeTaux()
	{
		return soldeInitial;
	}
	
	public void ajouterOperation(Operation ope)
	{
		for(int i=0;i<this.tab.length;i++)
		{
			if(tab[i]==null)
			{
				tab[i]=ope;
				compteur=i+1;
				i=this.tab.length;
			}
		}
		
	}
	
	public double getSolde()
	{
		double resultat=this.soldeInitial;
		for(int i=0;i<this.tab.length;i++)
		{
			if(tab[i]==null)
			{
				i=this.tab.length;
			}
			else
			{
				if(this.tab[i].getType()=="CREDIT")
					resultat+=this.tab[i].getOpe();
				else
					resultat-=this.tab[i].getOpe();
			}
		}
		return resultat;
	}

	double getSolde(String type)
	{
		return 0;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Compte))
			return false;
		
		Compte temps=(Compte)obj;
		return this.numCompte==temps.numCompte;
	}

}

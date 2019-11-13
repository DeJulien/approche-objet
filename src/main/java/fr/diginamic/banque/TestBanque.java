package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Compte cp1 = new Compte(400,30);

		Compte cp2 = new CompteTaux(200,10,2);
		
		Compte tab[]=new Compte[2];
		tab[0]=cp1;
		tab[1]=cp2;
		double totalSolde=0;
		
		
		//affichage
		for(int i=0;i<=1;i++)
		{	
			System.out.println(tab[i].calculeTaux());
			totalSolde+=tab[i].calculeTaux();
			System.out.println(tab[i].toString());
			System.out.println("");
		}
		System.out.println("le solde total est de :"+totalSolde);
	}
}

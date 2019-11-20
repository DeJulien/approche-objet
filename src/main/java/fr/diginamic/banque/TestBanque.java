package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;


public class TestBanque {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*Compte cp1 = new Compte(4,300);
		
		Credit op1= new Credit("",50);
		Credit op2= new Credit("",50);
		Credit op3= new Credit("",150);
		Debit op4= new Debit("",150);
		
		cp1.ajouterOperation(op1);
		cp1.ajouterOperation(op2);
		System.out.println(cp1.toString());
		cp1.ajouterOperation(op3);
		System.out.println(cp1.toString());
		cp1.ajouterOperation(op4);
		cp1.getSolde();
		
		
		System.out.println(cp1.toString());
		System.out.println("solde total :"+cp1.getSolde());*/
		
		/*Compte cp2 = new CompteTaux(200,10,2);
		
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
		System.out.println("le solde total est de :"+totalSolde);*/
		
		Compte compte1 = new Compte(4,300);
		Compte compte2 = new Compte(4,300);
		System.out.println(compte1==compte2);//return false
		Compte compte3 = compte2;
		System.out.println(compte3==compte2);//return true
		System.out.println(compte3.equals(compte2));//return true
	}
}

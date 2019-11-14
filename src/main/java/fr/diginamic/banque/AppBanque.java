package fr.diginamic.banque;

import java.util.Scanner;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.CompteDao;
import fr.diginamic.banque.entites.CompteDaoMem;


public class AppBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int choix=0;
		CompteDaoMem cdm = new CompteDaoMem();
		
		
		while(choix<99)
		{
			System.out.println("");
			System.out.println("***** Administration des comptes ***** \n1. Lister les comptes \n2. Ajouter un nouveau compte \n3. Ajouter une opération à un compte \n4. Supprimer un compte \n99. Sortir ");
			choix=sc.nextInt();
			if(choix==1)
			{
				Compte tab[]=new Compte[10];
				tab=cdm.lister();
				for(int i=0;i<tab.length;i++)
				{
					if(tab[i]!=null)
					{
						System.out.println(tab[i].toString());
						System.out.println("solde total :"+tab[i].getSolde());
					}
				}
			}
			if(choix==2)
			{
				int num=0;
				int soldI=0;
				int type=0;
				int taux=0;
				
				String temps="";
				System.out.println("Veuillez saisir le numéro :" );
				num=sc.nextInt();
				System.out.println("Veuillez saisir le solde initial :");
				soldI=sc.nextInt();
				System.out.println(	"Veuillez saisir le type de compte (1: NORMAL, 2: REMUNERE) :");
				type=sc.nextInt();
				if(type==1)
				{
					temps="NORMAL";
				}
				if(type==2)
				{
					temps="REMUNERE";
				}
				if(type==1)
				{
					Compte compteTem= new Compte(num,soldI);
					cdm.sauvegarder(compteTem);
				}
				if(type==2)
				{
					System.out.println("Veuillez saisir le taux :");
					taux=sc.nextInt();
					CompteTaux compteTem= new CompteTaux(num,soldI,taux);
					cdm.sauvegarder(compteTem);
				}

			}
			if(choix==3)
			{
				int num;
				int type;
				String dat;
				int montant;
				String temp;
				
				System.out.println("Veuillez choisir le numéro de compte concerné :");
				num=sc.nextInt();
				temp=Integer.toString(num);

				if(cdm.existe(temp)==true)
				{
					System.out.println("Veuillez saisir le type d’opération (1 : CREDIT, 2 : DEBIT):");
					type=sc.nextInt();
					System.out.println("Veuillez saisir la date :");
					dat=Integer.toString(sc.nextInt());
					System.out.println("Veuillez saisir le montant :");
					montant=sc.nextInt();
					
					if(type==1)
					{
						Credit op= new Credit(dat,montant);
						cdm.getCompte(temp).ajouterOperation(op);
						
					}
					if(type==2)
					{
						Debit op= new Debit(dat,montant);
						cdm.getCompte(temp).ajouterOperation(op);
					}
				}
				
			}
			if(choix==4)
			{
				int num;
				String temp;
				System.out.println("Veuillez saisir le numéro de compte à supprimer :");
				num=sc.nextInt();
				temp=Integer.toString(num);
				if(cdm.existe(temp)==true)
				{
					cdm.supprimer(temp);
				}
				
			}
			if(choix==99)
			{
				System.out.println("Aurevoir :(");
			}
		}
		
	}

}

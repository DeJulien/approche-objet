package essais;

import entites.*;

public class TestPersonne {
	
	public static void main(String[] args) 
	{
		AdressePostale a= new AdressePostale(23,"rue de la belle étoile",34000,"renne");
		Personne p1= new Personne("toto","youpi",a);
		System.out.println(p1.affichage());
		System.out.println(a.affichage());
		
		System.out.println("");
		a.setAdress(10, "rue poutin", 37000, "renne");
		System.out.println(p1.GetNom());
		System.out.println(p1.GetPrenom());
		System.out.println(a.affichage());
		
		/*Personne p2= new Personne("Moule","Agauffre",a);
		System.out.println(p2.affichage());
		System.out.println(a.affichage());*/
	
	}

}

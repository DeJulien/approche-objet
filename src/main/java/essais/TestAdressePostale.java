package essais;
import entites.*;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale a= new AdressePostale(23,"rue de la belle étoile",34000,"renne");
		/*a.numeroDeRue=23;
		a.libelle ="rue de la belle étoile";
		a.codePostal=34000;
		a.ville="renne";*/
		
		System.out.println(a.affichage(a));
		
		AdressePostale b= new AdressePostale(10,"avenu coucou",76620,"le havre");
		
		System.out.println(b.affichage(b));
		
		
	}

}

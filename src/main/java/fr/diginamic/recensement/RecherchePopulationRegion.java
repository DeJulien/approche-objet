package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService{
	
	public void traiter(Recensement rec, Scanner scanner) {
		String info="";
		int total=0;
		
		Scanner sc = new Scanner(System.in);
		
		List<Ville> villes = rec.getVilles();
		
		System.out.println("3. Population d’une region donnée");
		System.out.println("Indiquer votre ville");
		
		info=sc.next();
		

		for (Ville ville: villes){
			if(ville.getNomR().equals(info)){
				total+=ville.getPopT();
			}
		}
		System.out.println("Votre Departement :"+info);
		System.out.println("Total de population :"+total);
		System.out.println("");
	}

}

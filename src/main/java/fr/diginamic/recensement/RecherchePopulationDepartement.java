package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement rec, Scanner scanner) {
		String info="";
		int total=0;
		
		Scanner sc = new Scanner(System.in);
		
		List<Ville> villes = rec.getVilles();
		
		System.out.println("1. Population d’un département donné");
		System.out.println("Indiquer votre departement");
		
		info=sc.next();
		

		for (Ville ville: villes){
			if(ville.getCodeD().equals(info)){
				total+=ville.getPopT();
			}
		}
		System.out.println("Votre Departement :"+info);
		System.out.println("Total de population :"+total);
		System.out.println("");
	}

}

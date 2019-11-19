package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VillePlusPeupleeReg extends MenuService {

public void traiter(Recensement rec, Scanner scanner) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Ville> villes = rec.getVilles();
		
		System.out.println("7. les 10 villes les plus peuplées d’une région");
		String info="";
		int count=0;
		Collections.sort(villes);
		
		info=sc.next();
		for (Ville ville: villes){
			if(ville.getNomR().equals(info)){
				if(count<10)
				{
					System.out.print(ville.getNomC()+" ");
					count++;
				}
			}
		}
		
		System.out.println(" ");
	}
	
}

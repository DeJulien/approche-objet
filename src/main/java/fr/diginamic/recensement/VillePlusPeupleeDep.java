package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VillePlusPeupleeDep extends MenuService{
	
public void traiter(Recensement rec, Scanner scanner) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Ville> villes = rec.getVilles();
		
		System.out.println("6. les 10 villes les plus peuplées d’un département");
		String info="";
		int count=0;
		Collections.sort(villes);
		
		info=sc.next();
		for (Ville ville: villes){
			if(ville.getCodeD().equals(info)){
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

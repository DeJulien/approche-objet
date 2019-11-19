package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VilleLesPlusPeuples extends MenuService {
	
public void traiter(Recensement rec, Scanner scanner) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Ville> villes = rec.getVilles();
		
		System.out.println("8. les 10 villes les plus peuplées de France");
		
		int count=0;
		Collections.sort(villes);
		Iterator<Ville> iter = villes.iterator();
		while(iter.hasNext())
		{
			Ville temp=iter.next();
			if(count<10)
			{
				System.out.print(temp.getNomC()+" ");
				count++;
			}
		}
		System.out.println(" ");
		
	}

}

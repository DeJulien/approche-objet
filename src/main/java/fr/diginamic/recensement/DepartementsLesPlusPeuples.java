package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DepartementsLesPlusPeuples extends MenuService{

	@Override
	public void traiter(Recensement rec, Scanner scanner) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Ville> villes = rec.getVilles();
		
		System.out.println("5. les 10 départements les plus peuplés");
		
		int count=0;
		Collections.sort(villes);
		Iterator<Ville> iter = villes.iterator();
		while(iter.hasNext())
		{
			Ville temp=iter.next();
			if(count<10)
			{
				System.out.print(temp.getCodeD()+" ");
				count++;
			}
		}
		System.out.println(" ");
		
	}

}

package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RegionPlusPeuplee extends MenuService{

	@Override
	public void traiter(Recensement rec, Scanner scanner) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		List<Ville> villes = rec.getVilles();
		
		System.out.println("4. les 10 régions les plus peuplées");
		
		int count=0;
		Collections.sort(villes);
		Iterator<Ville> iter = villes.iterator();
		while(iter.hasNext())
		{
			Ville temp=iter.next();
			if(count<10)
			{
				System.out.print(temp.getNomR()+" ");
				count++;
			}
		}
		System.out.println(" ");
	}

}

package maps;

import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class CreationEtManipulationMap {
	
	public static void main(String args[]) {
			HashMap<Integer, String> mapVilles = new HashMap<>();
			mapVilles.put(13, "Marseille");
			mapVilles.put(34, "Montpellier");
			mapVilles.put(44, "Nantes");
			mapVilles.put(75, "Paris");
			mapVilles.put(31, "Toulouse");
			//TODO Développements à réaliser ci-dessous
			
			mapVilles.put(59, "Lille");
			mapVilles.put(69, "Lyon");
			mapVilles.put(30, "Bordeaux");
			
			Iterator<Integer> iter = mapVilles.keySet().iterator();
			Iterator<String> iter2 = mapVilles.values().iterator();
			
			while(iter.hasNext())
			{
				System.out.println(iter.next()+" "+iter2.next());
			}
			System.out.println(mapVilles.size());
		
		}

}

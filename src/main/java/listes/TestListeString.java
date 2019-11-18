package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> liste = new ArrayList<String>();
		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");
		String max="";
		
		for(int i=0;i<liste.size();i++)
		{
			String temps=liste.get(i);
			if(temps.length()>max.length())
				max=liste.get(i);
		}
		
		System.out.println(max);
		
		for(int i=0;i<liste.size();i++)
		{
			String temps=liste.get(i);
			liste.set(i, temps.toUpperCase());
		}
		
		System.out.println("");
		for (int i=0;i<liste.size();i++)
		{
			System.out.println(liste.get(i));
		}
		System.out.println("");
		Iterator<String> iter = liste.iterator();
		while(iter.hasNext())
		{
			String temp=iter.next();
			if(temp.substring(0,1).equals("N"))
				iter.remove();
		}
		System.out.println("");
		for (int i=0;i<liste.size();i++)
		{
			System.out.println(liste.get(i));
		}
	}

	
}

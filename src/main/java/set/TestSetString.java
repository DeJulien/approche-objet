package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		String grand="";
		int max=0;
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext())
		{
			String temps = iter.next();
			if(temps.length()>max)
			{
				max=temps.length();
				grand=temps;
			}
			System.out.println(temps);
			
		}
		System.out.println("");
		System.out.println(grand);
		set.remove(grand);
		
		
		System.out.println("");
		Iterator<String> iter3 = set.iterator();
		while(iter3.hasNext())
		{
			String temps = iter3.next();
			System.out.println(temps);
		}
	}
	

}

package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import listes.Ville;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		double max=0;
		double min=0;
		
		Iterator<Double> iter = set.iterator();
		
		while(iter.hasNext())
		{
			double temps = iter.next();
			if(temps<min)
				min=temps;
			if(temps>max)
				max=temps;
			System.out.println(temps);
		}
		System.out.println("");
		System.out.println(max);
		System.out.println(min);
		System.out.println("");
		set.remove(min);
		
		System.out.println("");
		Iterator<Double> iter3 = set.iterator();
		while(iter3.hasNext())
		{
			double temps = iter3.next();
			System.out.println(temps);
		}
	}

}

package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import set.Pays;

public class TestPays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pays p1= new Pays(8000000,20.0);
		Pays p2= new Pays(5000000,30);
		Pays p3= new Pays(3000000,20);
		Pays p4= new Pays(7000000,30);
		Pays p5= new Pays(6000000,10.9);
		Pays p6= new Pays(4000000,20.1);
		Pays p7= new Pays(20000000,20.3);
		Pays p8= new Pays(10000000,10.6);
		Pays p9= new Pays(20000000,14.3);
		
		
		HashMap<String, Pays> map1 = new HashMap<String, Pays>();
		
		map1.put("USA",p1);
		map1.put("France",p2);
		map1.put("Allemagne",p3);
		map1.put("UK",p4);
		map1.put("Italie",p5);
		map1.put("Japon",p6);
		map1.put("Chine",p7);
		map1.put("Russie",p8);
		map1.put("Inde",p9);
		
		Iterator<Pays> iter = map1.values().iterator();
		Iterator<String> iter1 = map1.keySet().iterator();
		int min=200000000;
		String keyPays="";
		
		while(iter.hasNext())
		{
			Pays temps= iter.next();
			keyPays=iter1.next();
			System.out.println(keyPays+" "+temps.getNbHab());
		}
		System.out.println("");
		
		iter = map1.values().iterator();
		iter1 = map1.keySet().iterator();
		
		while(iter.hasNext())
		{
			Pays temps= iter.next();
			if(temps.getNbHab()<min)
			{
				keyPays=iter1.next();
				min=temps.getNbHab();
			}
		}
		System.out.println("");
		map1.remove(keyPays);
		
		iter = map1.values().iterator();
		iter1 = map1.keySet().iterator();
		while(iter.hasNext())
		{
			Pays temps= iter.next();
			keyPays=iter1.next();
			System.out.println(keyPays+" "+temps.getNbHab());
		}
		
		
	}

}

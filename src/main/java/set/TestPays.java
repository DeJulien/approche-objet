package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Pays> set = new HashSet<>();
		Pays p1= new Pays("USA",8000000,20);
		set.add(p1);
		Pays p2= new Pays("France",5000000,30);
		set.add(p2);
		Pays p3= new Pays("Allemagne",3000000,20);
		set.add(p3);
		Pays p4= new Pays("UK",7000000,30);
		set.add(p4);
		Pays p5= new Pays("Italie",6000000,10.9);
		set.add(p5);
		Pays p6= new Pays("Japon",4000000,20.1);
		set.add(p6);
		Pays p7= new Pays("Chine",20000000,20.3);
		set.add(p7);
		Pays p8= new Pays("Russie",10000000,10.6);
		set.add(p8);
		Pays p9= new Pays("Inde",20000000,14.3);
		set.add(p9);
		
		Iterator<Pays> iter = set.iterator();
		double max=0;
		String paysMax="";
		while(iter.hasNext())
		{
			Pays temps = iter.next();
			if(temps.getPibHab()>max)
			{
				max=temps.getPibHab();
				paysMax=temps.getNom();
			}
			System.out.println(temps.getNom()+" "+temps.getNbHab()+" "+temps.getPibHab());
			
		}
		System.out.println("");
		System.out.println(paysMax);
		System.out.println(max);
		System.out.println("");
		iter = set.iterator();
		Double cal=0.0;
		String paysMaxP="";
		Double calM=0.0;
		String paysMinP="";
		while(iter.hasNext())
		{
			Pays temps = iter.next();
			double test=temps.getPibHab()*temps.getNbHab();
			if(test>cal)
			{
				cal=test;
				paysMaxP=temps.getNom();
				calM=temps.getPibHab()*temps.getNbHab();
			}
			if(test<calM)
			{
				calM=test;
				paysMinP=temps.getNom();
			}
		}
		System.out.println("");
		System.out.println(paysMaxP);
		System.out.println(cal);
		System.out.println("");
		
		iter = set.iterator();
		Pays p20= new Pays("",0,0);
		while(iter.hasNext())
		{
			Pays temps = iter.next();
			if(temps.getNom().equals(paysMinP))
				p20=temps;
		}
		set.remove(p20);
		iter = set.iterator();
		while(iter.hasNext())
		{
			Pays temps = iter.next();
			System.out.println(temps.getNom()+" "+temps.getNbHab()+" "+temps.getPibHab());
		}
	}

}

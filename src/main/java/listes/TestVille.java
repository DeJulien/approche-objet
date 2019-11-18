package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Ville> liste = new ArrayList<Ville>();
		Ville v1=new Ville("Nice", 343000);
		liste.add(v1);
		Ville v2=new Ville("Carcassonne", 47800);
		liste.add(v2);
		Ville v3=new Ville("Lyon", 484000);
		liste.add(v3);
		Ville v4=new Ville("Foix", 9700);
		liste.add(v4);
		Ville v5=new Ville("Pau", 77200 );
		liste.add(v5);
		Ville v6=new Ville("Marseille", 850700);
		liste.add(v6);
		Ville v7=new Ville("Tarbes", 40600);
		liste.add(v7);
		Ville v8=new Ville("Narbonne", 53400);
		liste.add(v8);
		int max=0;
		int min=0;
		
		for (int i=0;i<liste.size();i++)
		{
			if(liste.get(i).gethab()>max)
			{
				max=liste.get(i).gethab();
			}
			if(min==0)
			{
				min=liste.get(i).gethab();
			}
			if(liste.get(i).gethab()<min)
			{
				min=liste.get(i).gethab();
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		Iterator<Ville> iter = liste.iterator();
		
		while(iter.hasNext())
		{
			Ville user = iter.next();
			if(user.gethab()==min)
				iter.remove();
		}
		
		
		System.out.println("");
		for (int i=0;i<liste.size();i++)
		{
			System.out.println(liste.get(i).getVille()+" "+liste.get(i).gethab());
		}
	}

}

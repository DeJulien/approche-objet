package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		int min=0;
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
		
		for (int i=0;i<list.size();i++)
		{
			if(list.get(i)>max)
				max=list.get(i);
			if(list.get(i)<min)
				min=list.get(i);
		}
		System.out.println("");
		System.out.println(list.size());
		System.out.println("");
		System.out.println(max);
		System.out.println(min);
		System.out.println("");
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext())
		{
			int temp=iter.next();
			if(temp==min)
				iter.remove();
		}
		System.out.println("");
		for (int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("");
		for (int i=0;i<list.size();i++)
		{
			int temp=0;
			if(list.get(i)<0)
			{
				list.set(i, list.get(i)*-1);
			}
		}
		System.out.println("");
		for (int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		
	}

}

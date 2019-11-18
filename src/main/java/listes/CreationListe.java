package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {
	
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<100;i++)
		{
			list.add(i+1);
		}
		System.out.println(list.size());
		
	}
	

}

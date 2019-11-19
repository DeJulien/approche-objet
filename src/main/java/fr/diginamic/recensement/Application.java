package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import set.Pays;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Ville> list = new ArrayList<Ville>();
		int count=0;
		
		try {
			File file = new File("D:/temps/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			for (String ligne: lignes){
				//System.out.println(ligne);
				
				String[] morceaux = ligne.split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[3];
				String nomCommune = morceaux[5];
				String population = morceaux[6];
				
				
				if(count!=0)
				{
					int populationTotale = Integer.parseInt(population.replace(" ", "").trim());
					
					Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune,
					nomCommune, populationTotale);
					list.add(ville);
				}
				count++;
				}
				//System.out.println("Nombre de lignes :" + lignes.size());

			
			} catch (IOException e) {
			System.out.println(e.getMessage());
			}
			System.out.println("-----------etape 3----------");
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getNomC().equals("Montpellier"))
					System.out.println(list.get(i).toString());
			}
			System.out.println("-----------etape 4----------");
			int totalHerault=0;
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getCodeD().equals("34"))
					totalHerault+=list.get(i).getPopT();
			}
			System.out.println(totalHerault);
			System.out.println("-----------etape 5----------");
			int min=9000000;
			String petitVille="";
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getCodeD().equals("34"))
				{
					if(list.get(i).getPopT()<min)
					{
						min=list.get(i).getPopT();
						petitVille=list.get(i).getNomC();
					}
				}
			}
			System.out.println(petitVille);
			System.out.println("---------etape 6---------");
			count=0;

			System.out.println("les plus grandes :");
			for(int i=0;i<list.size();i++)
			{
				Collections.sort(list);
				if(list.get(i).getCodeD().equals("34"))
				{
					if(count<10)
					{
						System.out.print(list.get(i).getNomC()+" ");
						count++;
					}
				}
			}
			count=0;
			System.out.println(" ");
			System.out.println("les plus petites :");
			for(int i=0;i<list.size();i++)
			{
				Collections.sort(list, Collections.reverseOrder());
				if(list.get(i).getCodeD().equals("34"))
				{
					if(count<10)
					{
						System.out.print(list.get(i).getNomC()+" ");
						count++;
					}
				}
			}
			System.out.println(" ");
			System.out.println("-----------etape 7-----------");
			long totalRegion=0;
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getNomR().equals("Occitanie"))
					totalRegion+=list.get(i).getPopT();
			}
			System.out.println("population total de la region Occitanie : "+totalRegion);
			
			System.out.println("-------------etape 8------------");
			count=0;

			System.out.println("les plus grandes Ville d'occitanie : ");
			for(int i=0;i<list.size();i++)
			{
				Collections.sort(list);
				if(list.get(i).getNomR().equals("Occitanie"))
				{
					if(count<10)
					{
						System.out.print(list.get(i).getNomC()+" ");
						count++;
					}
				}
			}
			count=0;
			System.out.println(" ");
			System.out.println(" le département le plus peuplé de la région Occitanie : ");
			for(int i=0;i<list.size();i++)
			{
				Collections.sort(list);
				if(list.get(i).getNomR().equals("Occitanie"))
				{
					if(count<1)
					{
						System.out.print(list.get(i).getCodeD()+" ");
						count++;
					}
				}
			}
			
			System.out.println(" ");
			System.out.println("---------etape 9---------");
			count=0;

			System.out.println("les plus grandes Ville de France : ");
			for(int i=0;i<list.size();i++)
			{
				Collections.sort(list);
				if(count<10)
				{
					System.out.print(list.get(i).getNomC()+" ");
					count++;
				}
				
			}
			System.out.println(" ");
			count=0;

			System.out.println("les plus grandes departements de France : ");
			for(int i=0;i<list.size();i++)
			{
				Collections.sort(list);
				if(count<10)
				{
					System.out.print(list.get(i).getCodeD()+" ");
					count++;
				}
				
			}
			System.out.println(" ");
			count=0;

			System.out.println("les plus grandes region de France : ");
			for(int i=0;i<list.size();i++)
			{
				Collections.sort(list);
				if(count<10)
				{
					System.out.print(list.get(i).getNomR()+" ");
					count++;
				}
				
			}
			
	}

}

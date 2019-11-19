package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class ApplicationV2 {

	public static void main(String[] args) {
		
		Recensement recensement = RecensementUtils.lire("D:/temps/recensement population 2016.csv");
		//creation de l'arrayList avec contenue du fichier
		
		int choix=0;

		Scanner sc = new Scanner(System.in);
		while(choix<9)
		{
			System.out.println("--------Choissir votre numero--------");
			System.out.println("- 1. Population d�une ville donn�e");
			System.out.println("- 2. Population d�un d�partement donn�");
			System.out.println("- 3. Population d�une r�gion donn�e");
			System.out.println("- 4. Afficher les 10 r�gions les plus peupl�es");
			System.out.println("- 5. Afficher les 10 d�partements les plus peupl�s");
			System.out.println("- 6. Afficher les 10 villes les plus peupl�es d�un d�partement");
			System.out.println("- 7. Afficher les 10 villes les plus peupl�es d�une r�gion");
			System.out.println("- 8. Afficher les 10 villes les plus peupl�es de France");
			System.out.println("- 9. Sortir");
			choix=sc.nextInt();
			
			switch (choix){
				case 1:
					RecherchePopulationVille rechercheVille = new RecherchePopulationVille();
					rechercheVille.traiter(recensement, sc);
				break;
				case 2:
					RecherchePopulationDepartement rechercheDept = new RecherchePopulationDepartement();
					rechercheDept.traiter(recensement, sc);
				break;
				case 3:
					RecherchePopulationRegion rechercheRegion = new RecherchePopulationRegion();
					rechercheRegion.traiter(recensement, sc);
				break;
				case 4:
					RegionPlusPeuplee regionPlusPeuplee =new RegionPlusPeuplee();
					regionPlusPeuplee.traiter(recensement,sc);
				break;
				case 5:
					DepartementsLesPlusPeuples departementPlusPeuplee = new DepartementsLesPlusPeuples();
					departementPlusPeuplee.traiter(recensement,sc);
				break;
				case 6:
					VillePlusPeupleeDep villePlusDep = new VillePlusPeupleeDep();
					villePlusDep.traiter(recensement,sc);
				break;
				case 7:
					VillePlusPeupleeReg villePlusReg = new VillePlusPeupleeReg();
					villePlusReg.traiter(recensement,sc);
				break;
				case 8:
					VilleLesPlusPeuples villePlusPeuplee = new VilleLesPlusPeuples();
					villePlusPeuplee.traiter(recensement,sc);
				break;
				case 9:
					choix=20;
				break;
			}
			
			
			
		}
		
		

	}

}

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
			System.out.println("- 1. Population d’une ville donnée");
			System.out.println("- 2. Population d’un département donné");
			System.out.println("- 3. Population d’une région donnée");
			System.out.println("- 4. Afficher les 10 régions les plus peuplées");
			System.out.println("- 5. Afficher les 10 départements les plus peuplés");
			System.out.println("- 6. Afficher les 10 villes les plus peuplées d’un département");
			System.out.println("- 7. Afficher les 10 villes les plus peuplées d’une région");
			System.out.println("- 8. Afficher les 10 villes les plus peuplées de France");
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

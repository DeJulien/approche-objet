package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class RecensementUtils {
	public static Recensement lire(String cheminFichier){
		Recensement recensement = new Recensement();

		List<String> lignes = null;
		try {
			File file = new File(cheminFichier);
			lignes = FileUtils.readLines(file, "UTF-8");

			// On supprime la ligne d'ent�te avec les noms des colonnes
			lignes.remove(0);

			for (String ligne: lignes){
				ParseurVille.ajoutLigne(recensement, ligne);
			}
			return recensement;

		} catch (IOException e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

}

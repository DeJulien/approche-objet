package fr.diginamic.recensement;

public class ParseurVille {
	
	public static void ajoutLigne(Recensement recensement, String ligne){

		String[] morceaux = ligne.split(";");
		String codeRegion = morceaux[0];
		String nomRegion = morceaux[1];
		String codeDepartement = morceaux[2];
		String codeCommune = morceaux[3];
		String nomCommune = morceaux[5];
		String population = morceaux[6];
		int populationTotale = Integer.parseInt(population.replace(" ", "").trim());

		
		Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);

		
		recensement.getVilles().add(ville);

	}

}

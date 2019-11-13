package entites;

public class AdressePostale {
	
	public int numeroDeRue;
	public String libelle;
	public int codePostal; 
	public String ville;
	
	public AdressePostale(int num, String lib, int codeP, String vil)
	{
		this.numeroDeRue=num;
		this.libelle=lib;
		this.codePostal=codeP;
		this.ville=vil;
	}
	
	
	
	public String affichage(AdressePostale a)
	{
		return "le numero de rue :"+a.numeroDeRue+"\nlibelle :"+a.libelle+ "\ncode postal :"+a.codePostal+"\nville : "+a.ville;
	}

}

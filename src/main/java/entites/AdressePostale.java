package entites;

public class AdressePostale {
	
	public int numeroDeRue;
	public String libelle;
	public int codePostal; 
	public String ville;
	
	public AdressePostale(int num, String lib, int codeP, String vil)
	{
		numeroDeRue=num;
		libelle=lib;
		codePostal=codeP;
		ville=vil;
	}
	
	
	
	public String affichage()
	{
		return "le numero de rue :"+numeroDeRue+" libelle : "+libelle+ "code postal : "+codePostal+" ville : "+ville;
	}

}

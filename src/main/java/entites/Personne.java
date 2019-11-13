package entites;

public class Personne 
{
	String nom;
	String prenom;
	AdressePostale a;
	
	public Personne (String n, String p, AdressePostale ad)
	{
		this.nom=n;
		this.prenom=p;
		this.a=ad;
		
	}
	
	public String GetNom()
	{
		return this.nom;
	}
	
	public String GetPrenom()
	{
		return this.prenom;
	}
	
	public AdressePostale getAdresse()
	{
		return this.a;
	}

	public String affichage()
	{
		return "Nom de la personne :"+this.nom+"\nPrenom de la personne :"+this.prenom;
	}
}

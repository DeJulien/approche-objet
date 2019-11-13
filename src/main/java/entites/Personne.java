package entites;

public class Personne 
{
	String nom;
	String prenom;
	AdressePostale a;
	
	public Personne (String n, String p, AdressePostale a)
	{
		this.nom=n;
		this.prenom=p;
		
	}

	public String affichage()
	{
		return "Nom de la personne :"+this.nom+"\nPrenom de la personne :"+this.prenom;
	}
}

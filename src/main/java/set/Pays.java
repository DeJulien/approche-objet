package set;

public class Pays {
	
	public String nom;
	public int nbHab;
	public double PIBhab;
	
	public Pays(String nom, int nbHab, double PIBhab)
	{
		this.nom=nom;
		this.nbHab=nbHab;
		this.PIBhab=PIBhab;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public int getNbHab()
	{
		return this.nbHab;
	}
	
	public double getPibHab()
	{
		return this.PIBhab;
	}

}

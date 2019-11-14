package fr.diginamic.banque.entites;

public class CompteDaoMem  implements CompteDao  {
	
	public Compte tab[]=new Compte[10];
	
	/** Retourne la liste de tous les comptes
	* @return
	*/
	public Compte[] lister()
	{
		return this.tab;
	}
	/** Permet de sauvegarder un nouveau compte
	* @param nvCompte nouveau compte à sauvegarder
	*/
	public void sauvegarder(Compte nvCompte)
	{
		for(int i=0;i<this.tab.length;i++)
		{
			if(tab[i]==null)
			{
				tab[i]=nvCompte;
				i=this.tab.length;
			}
		}
	}

	/** Supprime un compte
	* Retourne true si la suppression a été réalisée avec succès, false sinon.
	* @param numero numéro du compte à supprimer
	*/
	public boolean supprimer(String numero)
	{
		boolean test=false;
		for(int i=0;i<this.tab.length;i++)
		{
			if(tab[i].numCompte==Integer.parseInt(numero))
			{
				tab[i]=null;
				i=this.tab.length;
				test=true;
			}
		}
		return test;
	}

	/** Retourne true si le numéro du compte passé en paramètre existe,
	* false dans le cas contraire
	* @param numero numéro du compte
	* @return boolean
	*/
	public boolean existe(String numero)
	{
		boolean test=false;
		for(int i=0;i<this.tab.length;i++)
		{
			if(tab[i].numCompte==Integer.parseInt(numero))
			{
				i=this.tab.length;
				test=true;
			}
		}
		return test;
	}

	/** Retourne le compte dont le numéro est passé en paramètre
	* @param numéro numéro du compte
	* @return Compte
	*/
	public Compte getCompte(String numero)
	{
		Compte temp= null;
		for(int i=0;i<this.tab.length;i++)
		{
			if(tab[i].numCompte==Integer.parseInt(numero))
			{
				temp=tab[i];
				i=this.tab.length;
			}
		}
		return temp;
	}

}

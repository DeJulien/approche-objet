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
	* @param nvCompte nouveau compte � sauvegarder
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
	* Retourne true si la suppression a �t� r�alis�e avec succ�s, false sinon.
	* @param numero num�ro du compte � supprimer
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

	/** Retourne true si le num�ro du compte pass� en param�tre existe,
	* false dans le cas contraire
	* @param numero num�ro du compte
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

	/** Retourne le compte dont le num�ro est pass� en param�tre
	* @param num�ro num�ro du compte
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

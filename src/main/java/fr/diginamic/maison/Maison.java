package fr.diginamic.maison;

public class Maison {
	
	
	
	Piece tab[]=new Piece[1];

	public void ajouterPiece(Piece p)
	{
		if((p!=null))
		{
			tab[tab.length-1]=p;
			Piece tabT[]=new Piece[this.tab.length+1];
			
			for (int i=0;i<tab.length;i++)
			{
				if(tab[i]!=null)
					tabT[i]=tab[i];
			}
			this.tab=tabT;
		}
	}
	
	public double superficieTotale()
	{
		double total=0.0;
		for (int i=0;i<tab.length;i++)
		{
			if(tab[i]!=null)
				total+=tab[i].superficie;
		}
		
		return total;
	}
	
	public double superficieEtage(int etage)
	{
		double total=0.0;
		for (int i=0;i<tab.length;i++)
		{
			if(tab[i]!=null)
			{
				if(tab[i].etage==etage)
					total+=tab[i].superficie;
			}
		}
		return total;
	}
	
	public double superficieTypePiece(String typePiece) {
		double superficie = 0;

		for (int i = 0; i < tab.length; i++) {
			if (typePiece!=null && typePiece.equals(this.tab[i].getType())) {
				superficie = superficie + this.tab[i].superficie;
			}
		}

		return superficie;
	}
	
}

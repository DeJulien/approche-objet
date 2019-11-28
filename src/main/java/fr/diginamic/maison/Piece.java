package fr.diginamic.maison;

public abstract class Piece {
	
	double superficie;
	int etage;
	
	public static final String TYPE_CHAMBRE = "Chambre";

	public static final String TYPE_SALON = "Salon";
	
	public static final String TYPE_CUISINE = "Cuisine";
	
	public static final String TYPE_WC = "WC";
	
	public static final String TYPE_SDB = "Salle de bain";
	
	public abstract String getType();

	
	public Piece(double superficie, int etage)
	{
		this.superficie=superficie;
		this.etage=etage;
	}
	
	public double getSuperficie() {
		return superficie;
	}
	
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	public int getNumEtage() {
		return etage;
	}
	
	public void setNumEtage(int numEtage) {
		this.etage = numEtage;
	}

}

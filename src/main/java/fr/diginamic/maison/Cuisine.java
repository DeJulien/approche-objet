package fr.diginamic.maison;

public class Cuisine extends Piece {

	public Cuisine(double superficie, int etage) {
		super(superficie, etage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return TYPE_CHAMBRE;
	}

}

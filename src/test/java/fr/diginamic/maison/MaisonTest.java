package fr.diginamic.maison;

import static org.junit.Assert.*;


import org.junit.Test;



public class MaisonTest {

	private Object[] pieces;

	@Test
	public void testAjouterPiece() {
		
		Piece p1=new Salon( 3.3, 0 );
		Piece[] pieces= new Piece[1];
		
		if (p1==null || p1.getNumEtage()<0 || p1.getSuperficie()<0){
			System.out.println("Votre pièce est incorrecte");
			return;
		}
		
		// On est obligé d'agrandir le tableau initial de 1 à chaque ajout
		// d'une nouvelle pièce
		
		// On commence donc par créer un tableau temporaire appelé newTab
		// qui a une taille égale à la tableau du tableau pieces+1
		Piece[] newTab = new Piece[pieces.length+1];
		
		// On déverse toutes les pièces du tableau pieces dans newTab
		for (int i=0; i<pieces.length; i++){
			newTab[i]=pieces[i];
		}
		
		// On place en dernière position dans le nouveau tableau la nouvelle
		// pièce
		newTab[newTab.length-1]=p1;
		
		// Enfin on affecte newTab à pieces
		this.pieces=newTab;
		
		assertEquals (p1, newTab[newTab.length-1]);
	}

	@Test
	public void testSuperficieTotale() {
		double superficieEtage = 0;
		Salon p1=new Salon(20.3,0);
		Chambre p2=new Chambre(20.3,0);
		Piece[] pieces= new Piece[2];
		pieces[0]=p1;
		pieces[1]=p2;
		int choixEtage=0;
		for (int i = 0; i < pieces.length; i++) {
			if (choixEtage == pieces[i].getNumEtage()) {
				superficieEtage = superficieEtage + pieces[i].getSuperficie();
			}
		}
		
		assertEquals (0.00001,40.6, superficieEtage);
	}

	@Test
	public void testSuperficieEtage() {
		double superficie = 0;
		
		Salon p1=new Salon(20.3,0);
		Chambre p2=new Chambre(20.3,1);
		Piece[] pieces= new Piece[2];
		pieces[0]=p1;
		pieces[1]=p2;
		
		String typePiece="Salon";
		for (int i = 0; i < pieces.length; i++) {
			if (typePiece!=null && typePiece.equals(pieces[i].getType())) {
				superficie = superficie + pieces[i].getSuperficie();
			}
		}
		
		assertEquals (0.00001,20.3, superficie);
	}

	@Test
	public void testSuperficieTypePiece() {
		double superficieTot = 0;
		Piece p1=new Salon(20.3,0);
		Piece p2=new Chambre(20.3,0);
		Piece[] pieces=new Piece[2];
		pieces[0]=p1;
		pieces[1]=p2;
		String typePiece="Salon";
		for (int i = 0; i < pieces.length; i++) {
			if(typePiece!=null && typePiece.equals(pieces[i].getType()))
				superficieTot = superficieTot + pieces[i].getSuperficie();
		}
	
		assertEquals (0.00001,20.3, superficieTot);
	}

}

package modele;

public class Vaisselle extends ObjetDonnee {
	private int nombrePiece;

	public Vaisselle(int identifiant) {
		super(identifiant);

	}
	
	public Vaisselle(int identifiant,int nombrePiece) {
		super(identifiant);
		this.nombrePiece = nombrePiece;

	}

	public int getNombrePiece() {
		return nombrePiece;
	}

	public void setNombrePiece(int nombrePiece) {
		this.nombrePiece = nombrePiece;
	}
	
	

}

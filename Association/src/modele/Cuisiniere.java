package modele;

public class Cuisiniere extends ObjetDonnee{
	private float puissance;
	private int nombrePlaque;

	public Cuisiniere(int identifiant) {
		super(identifiant);
		
	}

	public Cuisiniere(int identifiant, float puissance, int nombrePlaque) {
		super(identifiant);
		this.puissance = puissance;
		this.nombrePlaque = nombrePlaque;
	}

	public float getPuissance() {
		return puissance;
	}

	public void setPuissance(float puissance) {
		this.puissance = puissance;
	}

	public int getNombrePlaque() {
		return nombrePlaque;
	}

	public void setNombrePlaque(int nombrePlaque) {
		this.nombrePlaque = nombrePlaque;
	}

}

package modele;

public class ObjetDonnee {
	private int identifiant;
	private String couleur;
	private float longueur,largeur,hauteur;
	
	public ObjetDonnee(int identifiant) {
		this.identifiant = identifiant;
		couleur = "Inconnu";
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	public float getLargeur() {
		return largeur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}

	public float getHauteur() {
		return hauteur;
	}

	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}

	@Override
	public String toString() {
		return "[OBJET]\nidentifiant : " +identifiant + "\tcouleur : " + couleur +"\nlongueur : " + longueur + "\tlargeur : " + largeur + "\thauteur :" + hauteur;
	}
	
	
}

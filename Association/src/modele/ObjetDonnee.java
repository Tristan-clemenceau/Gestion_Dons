package modele;

import java.util.HashMap;

public class ObjetDonnee {
	private static int registre;
	private int identifiant;
	private static HashMap<Integer, String> objetReference = new HashMap<Integer, String>();
	private String couleur,categorie,nomObjet,description,descriptionComplementaire;
	private float longueur,largeur,hauteur;
	
	public ObjetDonnee() {
		identifiant = registre;
		couleur = "Inconnu";
		categorie = "Inconnu";
		nomObjet = "Inconnu";
		description = "Inconnu";
		descriptionComplementaire = "Inconnu";
		registre++;
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

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getNomObjet() {
		return nomObjet;
	}

	public void setNomObjet(String nomObjet) {
		this.nomObjet = nomObjet;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionComplementaire() {
		return descriptionComplementaire;
	}

	public void setDescriptionComplementaire(String descriptionComplementaire) {
		this.descriptionComplementaire = descriptionComplementaire;
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
		return "[OBJET]\nidentifiant : " +identifiant + "\tcouleur : " + couleur +"\tcategorie : " + categorie
				+ "\nnomObjet : " + nomObjet + "\tdescription : " +description + "\tdescriptionComplementaire :"
				+ descriptionComplementaire + "\nlongueur : " + longueur + "\tlargeur : " + largeur + "\thauteur :" + hauteur;
	}
	
	
}

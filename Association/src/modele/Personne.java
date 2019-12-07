package modele;

public class Personne {
	protected final static String UNSET = "Inconnu";
	private static int registre;
	private int identifiant;
	private String nom,coordonne,telephone;
	
	public Personne(String nom, String coordonne, String telephone) {
		this.identifiant = registre;
		this.nom = nom;
		this.coordonne = coordonne;
		this.telephone = telephone;
		registre++;
	}
	
	public Personne() {
		this.identifiant = registre;
		this.nom = UNSET;
		this.coordonne = UNSET;
		this.telephone = UNSET;
		registre++;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCoordonne() {
		return coordonne;
	}

	public void setCoordonne(String coordonne) {
		this.coordonne = coordonne;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Nom : "+nom+"\tTel : "+telephone+"\tCoordonnee : "+coordonne;
	}
	
	public void logMessage(String message) {
		
	}
	
}

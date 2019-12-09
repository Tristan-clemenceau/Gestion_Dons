package modele;

public class Table extends ObjetDonnee{
	private String type,forme;
	

	public Table(int identifiant) {
		super(identifiant);
		type = "Inconnu";
		forme = "Inconnu";
	}
	
	public Table(int identifiant,String type,String forme) {
		super(identifiant);
		this.type = type;
		this.forme = forme;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getForme() {
		return forme;
	}

	public void setForme(String forme) {
		this.forme = forme;
	}
	
}

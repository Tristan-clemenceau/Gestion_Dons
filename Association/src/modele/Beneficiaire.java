package modele;

import java.io.IOException;
import java.util.Date;

public class Beneficiaire extends PersonnePhysique {
	private String dateNaissance;

	public Beneficiaire(String prenom, String dateNaissance) throws IOException {
		super(prenom);
		this.dateNaissance = dateNaissance;
	}
	
	public Beneficiaire(int identifiant,String nom,String coordonee,String tel,String prenom,String date) throws IOException {
		 super(UNSET);
		 this.setIdentifiant(identifiant);
		 this.setNom(nom);
		 this.setCoordonne(coordonee);
		 this.setTelephone(tel);
		 this.setPrenom(prenom);
		 dateNaissance = date;
	}
	
	public Beneficiaire() throws IOException {
		super(UNSET);
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "[BENEFICIAIRE]\n"+super.toString()+"\tDateNaissance : "+dateNaissance;
	}
	
	
}

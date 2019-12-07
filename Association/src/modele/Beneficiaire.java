package modele;

import java.util.Date;

public class Beneficiaire extends PersonnePhysique {
	private Date dateNaissance;

	public Beneficiaire(String prenom, Date dateNaissance) {
		super(prenom);
		this.dateNaissance = dateNaissance;
	}
	
	public Beneficiaire() {
		super(UNSET);
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return super.toString()+"\tDateNaissance : "+dateNaissance;
	}
	
	
}

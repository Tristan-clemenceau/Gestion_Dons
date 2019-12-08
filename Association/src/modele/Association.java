package modele;

import java.util.ArrayList;
import java.util.List;

public class Association extends Stockage {
	private List<Don> archive = new ArrayList<Don>();
	private List<PersonnePhysique> personneLieAsso = new ArrayList<PersonnePhysique>(); 
	private List<Adherent> adherents = new ArrayList<Adherent>();
	private List<Beneficiaire> beneficiaire = new ArrayList<Beneficiaire>();
	
	public Association() {
		super();
	}

	public List<Don> getArchive() {
		return archive;
	}

	public void setArchive(List<Don> archive) {
		this.archive = archive;
	}

	public List<PersonnePhysique> getPersonneLieAsso() {
		return personneLieAsso;
	}

	public void setPersonneLieAsso(List<PersonnePhysique> personneLieAsso) {
		this.personneLieAsso = personneLieAsso;
	}

	public List<Adherent> getAdherents() {
		return adherents;
	}

	public void setAdherents(List<Adherent> adherents) {
		this.adherents = adherents;
	}

	public List<Beneficiaire> getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(List<Beneficiaire> beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	
	public void fillAdherent() {
		
	}
	
	public void fillBeneficiaire() {
		
	}

	public void setUp() {
		fillAdherent();
		fillBeneficiaire();
	}
	
	public void addAdherent(Adherent adherent) {
		adherents.add(adherent);
		personneLieAsso.add(adherent);
	}
	
	public void addBeneficiare(Beneficiaire beneficiare) {
		beneficiaire.add(beneficiare);
		personneLieAsso.add(beneficiare);
	}
	
	
	
	@Override
	public String toString() {
		return "[ASSOCIATION]\n"+super.toString()+"\nArchive=" + archive + "\nPersonneLieAsso=" + personneLieAsso + "\nAdherents=" + adherents
				+ "\nBeneficiaire=" + beneficiaire;
	}
	
	
}

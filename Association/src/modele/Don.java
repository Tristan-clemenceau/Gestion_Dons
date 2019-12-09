package modele;

import java.util.Date;

public class Don {
	private ObjetDonnee reference;
	private String type,description;
	private Stockage lieuxStockage;
	private float montant;
	private Beneficiaire beneficiaire;
	private Date dateEnlevement,dateRecpetion;
	private Adherent donateur,membreTraitantDossier;
	private StatutDon statu;
	
	public Don(ObjetDonnee reference,String type,String description,Adherent donateur) {
		this.reference = reference;
		this.type = type;
		this.description = description;
		this.donateur = donateur;
		statu = StatutDon.ATTENTE;
	}
	
	public Don() {
		statu = StatutDon.ATTENTE;
	}

	public ObjetDonnee getReference() {
		return reference;
	}

	public void setReference(ObjetDonnee reference) {
		this.reference = reference;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Stockage getLieuxStockage() {
		return lieuxStockage;
	}

	public void setLieuxStockage(Stockage lieuxStockage) {
		this.lieuxStockage = lieuxStockage;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public Beneficiaire getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(Beneficiaire beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	public Date getDateEnlevement() {
		return dateEnlevement;
	}

	public void setDateEnlevement(Date dateEnlevement) {
		this.dateEnlevement = dateEnlevement;
	}

	public Date getDateRecpetion() {
		return dateRecpetion;
	}

	public void setDateRecpetion(Date dateRecpetion) {
		this.dateRecpetion = dateRecpetion;
	}

	public Adherent getDonateur() {
		return donateur;
	}

	public void setDonateur(Adherent donateur) {
		this.donateur = donateur;
	}

	public Adherent getMembreTraitantDossier() {
		return membreTraitantDossier;
	}

	public void setMembreTraitantDossier(Adherent membreTraitantDossier) {
		this.membreTraitantDossier = membreTraitantDossier;
	}

	public StatutDon getStatu() {
		return statu;
	}

	public void setStatu(StatutDon statu) {
		this.statu = statu;
	}

	@Override
	public String toString() {
		return "Don [reference=" + reference + ", type=" + type + ", description=" + description + ", lieuxStockage="
				+ lieuxStockage + ", montant=" + montant + ", beneficiaire=" + beneficiaire + ", dateEnlevement="
				+ dateEnlevement + ", dateRecpetion=" + dateRecpetion + ", donateur=" + donateur
				+ ", membreTraitantDossier=" + membreTraitantDossier + ", statu=" + statu + "]";
	}
	
	
}

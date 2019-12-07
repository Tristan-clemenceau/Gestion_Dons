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
	
	public Don() {
		statu = StatutDon.ATTENTE;
		
	}
}

package test;

import modele.Adherent;
import modele.Association;
import modele.Beneficiaire;
import modele.Don;
import modele.Entrepot;
import modele.FonctionParticu;
import modele.ObjetDonnee;
import modele.StatutDon;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Beneficiaire b1 = new Beneficiaire();
			Adherent ad1 = new Adherent(FonctionParticu.MEMBRE);
			Association asso = new Association();
			ObjetDonnee obj = new ObjetDonnee(1);
			Don d = new Don();
			asso.setUp();
			asso.recherchePersonnePhysique(0, "Durand");
			asso.suppression(asso.getBeneficiaire().get(0));
			asso.modification(asso.getPersonneLieAsso().get(0), 2, "CACA");
			d.setStatu(StatutDon.REFUSE);
			d.setBeneficiaire(asso.getBeneficiaire().get(0));
			d.setMontant(10.0f);
			d.setLieuxStockage(new Entrepot());
			System.out.println(d.getLieuxStockage().getClass().getName().toUpperCase());
			asso.addDon(d);
			asso.rechercheDon(3);
			asso.closeLog();
		}catch(Exception e) {
			System.out.println("[ERREUR] : "+e.getMessage());
		}

	}

}

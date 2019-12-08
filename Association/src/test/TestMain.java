package test;

import modele.Adherent;
import modele.Association;
import modele.Beneficiaire;
import modele.FonctionParticu;
import modele.ObjetDonnee;
import services.LogService;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Beneficiaire b1 = new Beneficiaire();
			Adherent ad1 = new Adherent(FonctionParticu.MEMBRE);
			Association asso = new Association();
			ObjetDonnee obj = new ObjetDonnee();
			asso.setUp();
			asso.recherche(0, "Durand");
			asso.suppression(asso.getBeneficiaire().get(0));
			asso.modification(asso.getPersonneLieAsso().get(0), 2, "CACA");
			asso.closeLog();
		}catch(Exception e) {
			System.out.println("[ERREUR] : "+e.getMessage());
		}

	}

}

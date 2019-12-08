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
		Beneficiaire b1 = new Beneficiaire();
		Adherent ad1 = new Adherent(FonctionParticu.MEMBRE);
		Association asso = new Association();
		ObjetDonnee obj = new ObjetDonnee();
		try {
		LogService log = new LogService();
		log.writeToLog("test", "1");
		log.writeToLog("test", "2");
		log.closeLogFile();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(b1);
		System.out.println(ad1);
		System.out.println(asso);
		System.out.println(obj);
	}

}

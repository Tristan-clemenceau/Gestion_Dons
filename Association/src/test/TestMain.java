package test;

import modele.Adherent;
import modele.Association;
import modele.Beneficiaire;
import modele.FonctionParticu;
import modele.ObjetDonnee;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beneficiaire b1 = new Beneficiaire();
		Adherent ad1 = new Adherent(FonctionParticu.MEMBRE);
		Association asso = new Association();
		ObjetDonnee obj = new ObjetDonnee();
		
		System.out.println(b1);
		System.out.println(ad1);
		System.out.println(asso);
		System.out.println(obj);
		b1.logMessage("OOOHHHHHH");
	}

}

package test;

import modele.Adherent;
import modele.Beneficiaire;
import modele.FonctionParticu;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beneficiaire b1 = new Beneficiaire();
		Adherent ad1 = new Adherent(FonctionParticu.MEMBRE);
		System.out.println(b1);
		System.out.println(ad1);
		
	}

}

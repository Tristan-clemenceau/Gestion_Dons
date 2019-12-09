package association;

import java.util.Scanner;

import modele.Association;
import modele.DepotVente;
import modele.Entrepot;
import modele.TypeActivite;

public class Main {

	public static void main(String[] args) {
		try {
			//Creation Objet Entreprot, asso , depot vente
			Entrepot entrepot = new Entrepot(TypeActivite.ENTREPOT);
			DepotVente depotVente = new DepotVente(TypeActivite.DEPOTVENTE);
			Association association = new Association(TypeActivite.ASSOCIATION);
			//var 
			boolean ok = setUp();
			//Ajout des données contenu dans les txt en memoire
			while(ok) {
				run();
				
				ok = setUp();
			}

		} catch (Exception e) {
			System.out.println("[ERREUR]-"+e.getMessage());
			e.getStackTrace();
		}

	}
	public static boolean setUp() throws Exception {
		message("Bonjour voulez vous utiliser le programme ? :\n oui : 0\n non : 1\nVotre choix :"); 
		return choixSetUp();
	}
	public static void run() throws Exception {
		message("Bonjour veuillez choisir un module : \n1.Personne\n2.Don\n3.Recherche\n4.Statistique\nEntrer votre choix :"); 
		//FAIRE CHOIX
		redirection1(choixModule());
	}
	//METHODE POUR LES DIFFERENTS CHOIX
	public static boolean choixSetUp() {
		Scanner sc = new Scanner(System.in);
		String choix = sc.nextLine();

		boolean ok = choix.equals("0") || choix.equals("1");
		while (!ok) {
			System.out.println("Les choix possibles de réponse sont 0,1");
			choix = sc.nextLine();
			ok = choix.equals("0") || choix.equals("1");
		}
		
		if(choix.equals("0")) {
			return true;
		}else {
			return false;
		}

	}
	public static int choixModule() {
		Scanner sc = new Scanner(System.in);
		String choix = sc.nextLine();

		boolean ok = choix.equals("1") || choix.equals("2") || choix.equals("3") || choix.equals("4");
		while (!ok) {
			System.out.println("Les choix possibles de réponse sont 1,2,3,4");
			choix = sc.nextLine();
			ok = choix.equals("1") || choix.equals("2") || choix.equals("3") || choix.equals("4");
		}
		return Integer.parseInt(choix);

	}

	//METOHDE AFFICHAGE
	public static void message(String Message) {
		System.out.println(Message);
	}

	//METHODE REDIRECTION
	public static void redirection1(int value) throws Exception {
		switch (value) {
		case 1:
			message("Module Personne : \n1.Lire fichier\n2.Recherche Beneficiare par nom/Telephone\n3.Modification personne\n4.Suppression personnen\n5.Recherche Beneficiare par nom/Telephone\nEntrer votre choix :");
			break;
		case 2:
			message("Module Don : \n1.Creation don \n2.Stockage don \n3.Transfert Beneficiare\n4.Archiver un don\nEntrer votre choix :");
			break;
		case 3:
			message("Module Recherche : \n1.Don refuse\n2.Don en traitement \n3.Don vendus \n4.Don donnes\n5.Don stocke en entrepot\n6.Don par depot vente\nEntrer votre choix :");
			break;
		case 4:
			message("Module Statistique : \nEn Cours de construction\nEntrer votre choix :");
			break;
		}
	}

}

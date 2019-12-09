package association;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import exception.ExceptionAdherentFile;
import exception.ExceptionBeneficiaireFile;
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
				run(association);

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
	public static void run(Association association) throws Exception {
		message("Veuillez choisir un module : \n1.Personne\n2.Don\n3.Recherche\n4.Statistique\nEntrer votre choix :"); 
		redirection1(choixModule(),association);
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
	
	public static int choixModulePersonne() {
		Scanner sc = new Scanner(System.in);
		String choix = sc.nextLine();

		boolean ok = choix.equals("1") || choix.equals("2") || choix.equals("3") || choix.equals("4")|| choix.equals("5")|| choix.equals("6")|| choix.equals("7");
		while (!ok) {
			System.out.println("Les choix possibles de réponse sont 1,2,3,4");
			choix = sc.nextLine();
			ok = choix.equals("1") || choix.equals("2") || choix.equals("3") || choix.equals("4")|| choix.equals("5")|| choix.equals("6")|| choix.equals("7");
		}
		return Integer.parseInt(choix);

	}

	//METOHDE AFFICHAGE
	public static void message(String Message) {
		System.out.println(Message);
	}

	//METHODE REDIRECTION
	public static void redirection1(int value,Association association) throws Exception {
		switch (value) {
		case 1:
			message("Module Personne : \n1.Lire fichier\n2.Recherche Beneficiare par nom\n3.Recherche Beneficiare par Telephone\n4.Modification personne\n5.Suppression personnen\n6.Recherche Adherent par nom\n7 Recherche Adherent par Telephone\nEntrer votre choix :");
			redirectionPersonne(choixModulePersonne(), association);
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

	public static void redirectionPersonne(int value, Association association ) throws Exception {
		switch (value) {
		case 1:
			lireFichier(association);
			break;
		case 2:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				message("Entrez un nom :");
				recherchePersonne( association,2,choixPersonne());
			}
			break;
		case 3:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				message("Entrez un telephone :");
				recherchePersonne( association,3,choixPersonne());
			}
			break;
		case 4:
			//message("Module Statistique : \nEn Cours de construction\nEntrer votre choix :");
			System.out.println(4);
			break;
		case 5:
			suppressionPersonne(association);
			break;
		case 6:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				message("Entrez un nom :");
				recherchePersonne( association,0,choixPersonne());
			}
			
			break;
		case 7:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				message("Entrez un telephone :");
				recherchePersonne( association,1,choixPersonne());
			}
			break;
		}
	}
	//METHODE SUB
	public static void lireFichier(Association association) throws NumberFormatException, IOException, ExceptionBeneficiaireFile, ParseException, ExceptionAdherentFile {
		association.setUp();
		message("==Les fichiers ont bien ete chargee==");
	}
	
	public static String choixPersonne() {
		Scanner sc = new Scanner(System.in);
		String choix = sc.nextLine();
		return choix;
	} 
	
	public static void suppressionPersonne(Association association) throws Exception {
		association.dispPersonnne();
		message("Veillez choisir le numero de la personne a supprimer");
		int choix = Integer.parseInt(choixPersonne());
		if(choix>=0 && choix < association.getPersonneLieAsso().size()) {
			association.suppression(association.getPersonneLieAsso().get(choix));
		}else {
			message("Vous ne pouvez pas supprimer une personne qui n existe pas ");
		}
		
	}
	
	public static void recherchePersonne(Association association,int etat,String var) throws IOException {
		System.out.println("var : "+var+"etat : "+etat);
		association.recherchePersonnePhysique(etat, var);
	}


}

package association;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.ExceptionAdherentFile;
import exception.ExceptionBeneficiaireFile;
import modele.Association;
import modele.DepotVente;
import modele.Entrepot;
import modele.Stockage;
import modele.TypeActivite;

public class Main {

	public static void main(String[] args) {
		try {
			//Creation Objet Entreprot, asso , depot vente
			Entrepot entrepot = new Entrepot(TypeActivite.ENTREPOT);
			DepotVente depotVente = new DepotVente(TypeActivite.DEPOTVENTE);
			Association association = new Association(TypeActivite.ASSOCIATION);
			//var 
			ArrayList<Stockage> list = new ArrayList<Stockage>();
			list.add(association);
			list.add(depotVente);
			list.add(entrepot);
			boolean ok = setUp();

			while(ok) {
				run(association,list);

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
	public static void run(Association association,ArrayList<Stockage> list) throws Exception {
		message("Veuillez choisir un module : \n1.Personne\n2.Don\n3.Recherche\n4.Statistique\nEntrer votre choix :"); 
		redirection1(choixModule(),association,list);
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
			System.out.println("Les choix possibles de réponse sont 1,2,3,4,5,6,7");
			choix = sc.nextLine();
			ok = choix.equals("1") || choix.equals("2") || choix.equals("3") || choix.equals("4")|| choix.equals("5")|| choix.equals("6")|| choix.equals("7");
		}
		return Integer.parseInt(choix);

	}

	public static int choixModuleRecherche() {
		Scanner sc = new Scanner(System.in);
		String choix = sc.nextLine();

		boolean ok = choix.equals("1") || choix.equals("2") || choix.equals("3") || choix.equals("4")|| choix.equals("5")|| choix.equals("6");
		while (!ok) {
			System.out.println("Les choix possibles de réponse sont 1,2,3,4,5,6");
			choix = sc.nextLine();
			ok = choix.equals("1") || choix.equals("2") || choix.equals("3") || choix.equals("4")|| choix.equals("5")|| choix.equals("6");
		}
		return Integer.parseInt(choix);

	}

	public static int choixModuleDon() {
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
	public static void redirection1(int value,Association association,ArrayList<Stockage> list) throws Exception {
		switch (value) {
		case 1:
			message("Module Personne : \n1.Lire fichier\n2.Recherche Beneficiare par nom\n3.Recherche Beneficiare par Telephone\n4.Modification personne\n5.Suppression personnen\n6.Recherche Adherent par nom\n7 Recherche Adherent par Telephone\nEntrer votre choix :");
			redirectionPersonne(choixModulePersonne(), association);
			break;
		case 2:
			message("Module Don : \n1.Creation don \n2.Stockage don \n3.Transfert Beneficiare\n4.Archiver un don\nEntrer votre choix :");
			redirectionDon(choixModuleDon(), association,list);
			break;
		case 3:
			message("Module Recherche : \n1.Don refuse\n2.Don en traitement \n3.Don vendus \n4.Don donnes\n5.Don stocke en entrepot\n6.Don par depot vente\nEntrer votre choix :");
			redirectionRecherche( choixModuleRecherche(),  association );
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
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				modificationPersonne( association);
			}
			break;
		case 5:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				suppressionPersonne(association);
			}
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

	public static void redirectionRecherche(int value, Association association ) throws Exception {
		switch (value) {
		case 1:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				association.rechercheDon(value);
			}
			break;
		case 2:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				association.rechercheDon(value);
			}
			break;
		case 3:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				association.rechercheDon(value);
			}
			break;
		case 4:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				association.rechercheDon(value);
			}
			break;
		case 5:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				association.rechercheDon(value);
			}
			break;
		case 6:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				association.rechercheDon(value);
			}
			break;
		}
	}

	public static void redirectionDon(int value, Association association ,ArrayList<Stockage> list) throws Exception {
		switch (value) {
		case 1:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				creationDon(association);
			}
			break;
		case 2:
			if(association.getPersonneLieAsso().size() ==0 ) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else if(association.getListDons().size() ==0){
				message("Vous devez avoir créer un don avant de pouvoir le stocker");
			}else {
				stockageDon(association, list);
			}
			break;
		case 3:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				transferToBene();
			}
			break;
		case 4:
			if(association.getPersonneLieAsso().size() ==0) {
				message("Vous devez charger le fichier avant de faire cette opération");
			}else {
				archiveDon();
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
			message("La personne a bien ete supprimee");
		}else {
			message("Vous ne pouvez pas supprimer une personne qui n existe pas ");
		}

	}

	public static void modificationPersonne(Association association) throws Exception {
		association.dispPersonnne();
		message("Veillez choisir le numero de la personne a modifier");
		int choix = Integer.parseInt(choixPersonne());
		if(choix>=0 && choix < association.getPersonneLieAsso().size()) {
			message("Veillez choisir le numero du champ a modifier : \n1.Nom\n2.Coordonne\n3.Telephone\n4.Prenom");
			int choixChamp = Integer.parseInt(choixPersonne());
			if(choixChamp>0 && choixChamp<5) {
				message("Entrez la nouvelle valeur :");
				association.modification(association.getPersonneLieAsso().get(choix),  choixChamp,choixPersonne());
			}else {
				message("Cette modification n'est pas possible");
			}
		}else {
			message("Vous ne pouvez pas modifier une personne qui n existe pas ");
		}
	}

	public static void recherchePersonne(Association association,int etat,String var) throws IOException {
		System.out.println("var : "+var+"etat : "+etat);
		association.recherchePersonnePhysique(etat, var);
	}
	
	public static void creationDon(Association association) throws Exception {
		association.dispAdherentMembre();
		message("Veillez choisir le numero qui vous correspond");
		int choix = Integer.parseInt(choixPersonne());
		if(choix>=0 && choix < association.getAdherents().size()) {
			message("Veuillez entrer un nom d'objet parmis ceux suivant (Armoires,Assiettes,chaises,chevet,couverts,cuisiniere,electromenager,laveLinge,matelas,refrigerateur,table,vaisselle) : ");
			String nameObjetc = choixPersonne();
			message("Veuillez entrer l'identifiant de votre objet :");
			int identifiant = Integer.parseInt(choixPersonne());
			message("Veuillez entrer le type de votre objet (salon,cuisine etc..) : ");
			String type = choixPersonne();
			message("Veuillez entrer la forme de votre objet (rectangulaire , ovale etc.. ):");
			String forme = choixPersonne();
			message("Veuillez entrer la puissance de votre plaque (0 si pas de puissance pour votre objet ):");
			float puissance = Float.parseFloat(choixPersonne());
			message("Veuillez entrer le nombre de plaque de cuisson (0 si pas de plaque de cuisson pour votre objet ):");
			int nombrePlaque = Integer.parseInt(choixPersonne());
			message("Veuillez entrer le nombre de piece (0 si pas de piece pour votre objet ):");
			int nombrePiece = Integer.parseInt(choixPersonne());
			message("Veuillez indiquer le type de votre don (Mobilier , objet , argent):");
			String typeDeDon = choixPersonne();
			message("veuillez ecrire une petite description de votre objet (objet en bonne etat et rouge)");
			String description = choixPersonne();
			association.propositionDon(association.getAdherents().get(choix).creationDon(nameObjetc, identifiant, type, forme, puissance, nombrePlaque, nombrePiece, typeDeDon, description));
			System.out.println("Votre don a bien ete enregistre");
		}else {
			message("Vous ne pouvez pas choisir un element hors liste");
		}
	}
	
	public static void stockageDon(Association association,ArrayList<Stockage> list) throws Exception {
		association.dispDon();
		message("Veillez choisir le numero du don a stocker");
		int choix = Integer.parseInt(choixPersonne());
		if(choix>=0 && choix < association.getListDons().size()) {
			dispList(list);
			message("Veillez choisir le lieu ou stocker le don");
			int choixLieu = Integer.parseInt(choixPersonne());
			if(choixLieu>=0 && choixLieu<list.size()) {
				association.setStockageDon(association.getListDons().get(choix), list.get(choixLieu));
			}else {
				System.out.println("Il faut choisir un lieu existant");
			}
			message("Le don a bien ete stocke");
		}else {
			message("Vous ne pouvez pas stocker un don qui n existe pas ");
		}
	}

	public static void transferToBene() {
		
	}
	
	public static void archiveDon() {
		
	}
	
	public static void dispList(ArrayList<Stockage> list) {
		for (Stockage stockage : list) {
			System.out.println(list.indexOf(stockage)+stockage.getTypeActivite().name());
		}
	}

}

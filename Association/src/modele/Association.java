package modele;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import exception.ExceptionAdherentFile;
import exception.ExceptionBeneficiaireFile;
import services.LogService;

public class Association extends Stockage {
	private List<Don> archive = new ArrayList<Don>();
	private List<PersonnePhysique> personneLieAsso = new ArrayList<PersonnePhysique>(); 
	private List<Adherent> adherents = new ArrayList<Adherent>();
	private List<Beneficiaire> beneficiaire = new ArrayList<Beneficiaire>();
	private LogService log;

	public Association() throws IOException {
		super();
		log = new LogService();
	}

	public List<Don> getArchive() {
		return archive;
	}

	public void setArchive(List<Don> archive) {
		this.archive = archive;
	}

	public List<PersonnePhysique> getPersonneLieAsso() {
		return personneLieAsso;
	}

	public void setPersonneLieAsso(List<PersonnePhysique> personneLieAsso) {
		this.personneLieAsso = personneLieAsso;
	}

	public List<Adherent> getAdherents() {
		return adherents;
	}

	public void setAdherents(List<Adherent> adherents) {
		this.adherents = adherents;
	}

	public List<Beneficiaire> getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(List<Beneficiaire> beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	private void fillAdherent() throws IOException, ExceptionAdherentFile {
		log.writeToLog("info", "fillAdherent");
		File file = new File("src/file/Adherents.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			String parts[] = st.split(";");
			if(parts.length != 6) {
				throw new ExceptionAdherentFile("Le fichier Adherents.txt ne respecte pas la norme, soit une ligne doit avoir exactement 6 champs");
			}else {
				Adherent a = new Adherent(Integer.parseInt(parts[0]),parts[1],parts[2],parts[3],parts[4],setFonctionParticu(parts[5]));
				addAdherent(a);
			}
		}
	}

	private void fillBeneficiaire() throws IOException, ExceptionBeneficiaireFile, NumberFormatException, ParseException {
		log.writeToLog("info", "fillBeneficiaire");
		File file = new File("src/file/Beneficiaires.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			String parts[] = st.split(";");
			if(parts.length != 6) {
				throw new ExceptionBeneficiaireFile("Le fichier Beneficiaires.txt ne respecte pas la norme, soit une ligne doit avoir exactement 6 champs");
			}else {
				Beneficiaire b = new Beneficiaire(Integer.parseInt(parts[0]),parts[1],parts[2],parts[3],parts[4],parts[5]);
				addBeneficiare(b);
			}
		}
	}


	private FonctionParticu setFonctionParticu(String fonction) throws IOException {
		log.writeToLog("info", "setFonctionParticu");
		switch (fonction.toUpperCase()) {
		case "TRESORIE":
			return FonctionParticu.TRESORIE;
		case "PRESIDENT":
			return FonctionParticu.PRESIDENT;
		case "MEMBRE":
			return FonctionParticu.MEMBRE;
		default:
			return FonctionParticu.INCONNU;
		}
	}

	public void setUp() throws IOException, ExceptionBeneficiaireFile, NumberFormatException, ParseException, ExceptionAdherentFile {
		log.writeToLog("info", "setUp");
		fillAdherent();
		fillBeneficiaire();
	}

	public void addAdherent(Adherent adherent) {
		adherents.add(adherent);
		personneLieAsso.add(adherent);
	}

	public void addBeneficiare(Beneficiaire beneficiare) {
		beneficiaire.add(beneficiare);
		personneLieAsso.add(beneficiare);
	}

	public void closeLog() throws IOException {
		log.writeToLog("info", "closeLog");
		log.closeLogFile();
	}

	/*RECHERCHE*/

	public void recherche(int etat,String var) throws IOException {
		log.writeToLog("info", "recherche");
		//0 : adherent nom , 1 : adherent tel , 2 : beneficiaire nom , 3 : beneficiare tel
		switch (etat) {
		case 0:
			for(Adherent adherent : adherents) {
				if(adherent.getNom().toUpperCase().equals(var.toUpperCase())) {
					System.out.println(adherent);
				}
			}
			break;
		case 1:
			for(Adherent adherent : adherents) {
				if(adherent.getTelephone().toUpperCase().equals(var.toUpperCase())) {
					System.out.println(adherent);
				}
			}
			break;
		case 2:
			for(Beneficiaire beneficiaire : beneficiaire) {
				if(beneficiaire.getNom().toUpperCase().equals(var.toUpperCase())) {
					System.out.println(beneficiaire);
				}

			}
			break;
		case 3:
			for(Beneficiaire beneficiaire : beneficiaire) {
				if(beneficiaire.getTelephone().toUpperCase().equals(var.toUpperCase())) {
					System.out.println(beneficiaire);
				}
			}
			break;
		}
	}
	
	public void suppression(PersonnePhysique personne) throws Exception {
		log.writeToLog("info", "supression");
		if(personne.getClass().getName().toUpperCase().equals("MODELE.ADHERENT")) {
			personneLieAsso.remove(personneLieAsso.indexOf(personne));
			adherents.remove(adherents.indexOf(personne));
		}else if(personne.getClass().getName().toUpperCase().equals("MODELE.BENEFICIAIRE")){//MODELE.BENEFICIAIRE
			personneLieAsso.remove(personneLieAsso.indexOf(personne));
			beneficiaire.remove(beneficiaire.indexOf(personne));
		}else {
			throw new Exception("Il n'est pas possible de modifier cette personne car elle n'est pas dans la liste de personne associee a l association");
		}
	}

	@Override
	public String toString() {
		return "[ASSOCIATION]\n"+super.toString()+"\nArchive=" + archive + "\nPersonneLieAsso=" + personneLieAsso + "\nAdherents=" + adherents
				+ "\nBeneficiaire=" + beneficiaire;
	}


}

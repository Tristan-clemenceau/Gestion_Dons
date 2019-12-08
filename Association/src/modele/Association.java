package modele;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

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
	
	public void fillAdherent() throws IOException {
		log.writeToLog("info", "fillAdherent");
		File file = new File("src/file/Adherents.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
	}
	
	public void fillBeneficiaire() throws IOException, ExceptionBeneficiaireFile, NumberFormatException, ParseException {
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

	public void setUp() throws IOException, ExceptionBeneficiaireFile, NumberFormatException, ParseException {
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
		log.closeLogFile();
	}
	
	
	@Override
	public String toString() {
		return "[ASSOCIATION]\n"+super.toString()+"\nArchive=" + archive + "\nPersonneLieAsso=" + personneLieAsso + "\nAdherents=" + adherents
				+ "\nBeneficiaire=" + beneficiaire;
	}
	
	
}

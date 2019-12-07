package modele;

import java.util.ArrayList;
import java.util.List;

public class Association extends Stockage {
	private List<Don> archive = new ArrayList<Don>();
	private List<PersonnePhysique> PersonneLieAsso = new ArrayList<PersonnePhysique>(); 
	private List<Adherent> adherents = new ArrayList<Adherent>();
	private List<Beneficiaire> beneficiaire = new ArrayList<Beneficiaire>();
}

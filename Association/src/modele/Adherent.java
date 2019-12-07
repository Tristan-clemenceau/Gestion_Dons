package modele;

public class Adherent extends PersonnePhysique{
	private FonctionParticu fonctionParticuliere;
	
	public Adherent(FonctionParticu fonctionParticuliere) {
		this.fonctionParticuliere = fonctionParticuliere;
	}
	
	public Adherent() {
		fonctionParticuliere = FonctionParticu.INCONNU;
	}
	
	public FonctionParticu getFonctionParticuliere() {
		return fonctionParticuliere;
	}

	public void setFonctionParticuliere(FonctionParticu fonctionParticuliere) {
		this.fonctionParticuliere = fonctionParticuliere;
	}

	@Override
	public String toString() {
		return "[ADHERENT]\n"+super.toString()+"\tfonctionParticuliere : "+fonctionParticuliere;
	}
	
}

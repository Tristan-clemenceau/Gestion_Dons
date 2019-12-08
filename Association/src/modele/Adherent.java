package modele;

import java.io.IOException;

public class Adherent extends PersonnePhysique{
	private FonctionParticu fonctionParticuliere;
	
	public Adherent(FonctionParticu fonctionParticuliere) throws IOException {
		super();
		this.fonctionParticuliere = fonctionParticuliere;
	}
	
	public Adherent() throws IOException {
		super();
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

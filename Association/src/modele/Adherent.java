package modele;

import java.io.IOException;

public class Adherent extends PersonnePhysique{
	private FonctionParticu fonctionParticuliere;
	
	public Adherent(FonctionParticu fonctionParticuliere) throws IOException {
		super();
		this.fonctionParticuliere = fonctionParticuliere;
	}
	
	public Adherent(int identifiant,String nom,String coordonne,String tel,String prenom,FonctionParticu fonctionParticuliere) {
		super(prenom);
		this.fonctionParticuliere = fonctionParticuliere;
		super.setIdentifiant(identifiant);
		super.setNom(nom);
		super.setTelephone(tel);
		super.setCoordonne(coordonne);
	}
	
	public Adherent(){
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

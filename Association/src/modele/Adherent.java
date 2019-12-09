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
	
	public Don creationDon(String nameObjetc,int  identifiant,String type,String  forme,float puissance,int nombrePlaque, int nombrePiece, String typeDeDon, String description)throws Exception {
		if(this.getFonctionParticuliere().name().equals("membre".toUpperCase())) {
			return new Don(creationObjet( nameObjetc,  identifiant, type,  forme, puissance, nombrePlaque,  nombrePiece), type, description,this);
		}else {
			throw new Exception("Seul un membre peut faire un don a l'association");
		}
	}
	
	private ObjetDonnee creationObjet(String nameObjetc,int  identifiant,String type,String  forme,float puissance,int nombrePlaque, int nombrePiece) throws Exception {
		ObjetFactory obj = new ObjetFactory();
		return obj.getObjet(nameObjetc, identifiant, type, forme, puissance, nombrePlaque, nombrePiece);
	}

	@Override
	public String toString() {
		return "[ADHERENT]\n"+super.toString()+"\tfonctionParticuliere : "+fonctionParticuliere;
	}
	
}

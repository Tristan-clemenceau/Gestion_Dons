package modele;

public class ObjetFactory {

	public ObjetDonnee getObjet(String nameObjetc,int identifiant,String type,String forme,float puissance,int nombrePlaque,int nombrePiece) throws Exception {
		switch (nameObjetc.toLowerCase()) {
		case "matelas":
				return new Matelas(identifiant);
		case "chevet":
				return new Chevet(identifiant);
		case "armoires":
				return new Armoires(identifiant);
		case "table":
				return new Table(identifiant, type, forme);
		case "chaises":
				return new Chaises(identifiant);
		case "electromenager":
				return new ElectroMenager(identifiant);
		case "cuisiniere":
				return new Cuisiniere(identifiant, puissance, nombrePlaque);
		case "refrigerateur":
				return new Refrigerateur(identifiant);
		case "lavelinge":
				return new LaveLinge(identifiant);
		case "vaisselle":
				return new Vaisselle(identifiant, nombrePiece);
		case "couverts":
				return new Couverts(identifiant);
		case "assiettes":
				return new Assiettes(identifiant);
		default:
			throw new Exception("Cet objet n'est pas répertorié");
		}
	}
}

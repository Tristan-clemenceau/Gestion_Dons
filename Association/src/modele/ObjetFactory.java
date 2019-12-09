package modele;

public class ObjetFactory {

	public ObjetDonnee getObjet(String nameObjetc,int identifiant,String type,String forme,float puissance,int nombrePlaque,int nombrepiece) {
		switch (nameObjetc.toLowerCase()) {
		case "matelas":
				return new Matelas(identifiant);
		case "chevet":
				return new Chevet(identifiant);
		case "armoires":
				return new Armoires(identifiant);
		case "table":

			break;
		case "chaises":

			break;
		case "electromenager":

			break;
		case "cuisiniere":

			break;
		case "refrigerateur":

			break;
		case "lavelinge":

			break;
		case "vaisselle":

			break;
		case "couverts":

			break;
		case "assiettes":

			break;
		default:
			System.out.println("Cette objet n'est pas repertorié");
			break;
		}
	}
}

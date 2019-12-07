package modele;

public class PersonneMorale extends Personne {
	private String typeActivite;
	
	public PersonneMorale() {
		super(UNSET,UNSET,UNSET);
		typeActivite = UNSET;
	}
	
	public PersonneMorale(String typeActivite) {
		this.typeActivite = typeActivite;
	}

	public String getTypeActivite() {
		return typeActivite;
	}

	public void setTypeActivite(String typeActivite) {
		this.typeActivite = typeActivite;
	}

	@Override
	public String toString() {
		return super.toString()+"\t TypeActivite : "+typeActivite;
	}
	
	
}

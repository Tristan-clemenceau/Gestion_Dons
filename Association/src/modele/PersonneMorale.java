package modele;

public class PersonneMorale extends Personne {
	private TypeActivite typeActivite;
	
	public PersonneMorale() {
		super(UNSET,UNSET,UNSET);
		typeActivite = TypeActivite.INCONNU;
	}
	
	public PersonneMorale(TypeActivite typeActivite) {
		this.typeActivite = typeActivite;
	}

	public TypeActivite getTypeActivite() {
		return typeActivite;
	}

	public void setTypeActivite(TypeActivite typeActivite) {
		this.typeActivite = typeActivite;
	}

	@Override
	public String toString() {
		return super.toString()+"\t TypeActivite : "+typeActivite;
	}
	
	
}

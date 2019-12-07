package modele;

public class PersonnePhysique extends Personne{
	
	private String prenom;

	public PersonnePhysique(String prenom) {
		super(UNSET,UNSET,UNSET);
		this.prenom = prenom;
	}
	
	public PersonnePhysique() {
		super(UNSET,UNSET,UNSET);
		this.prenom = UNSET;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return super.toString()+"\tPrenom : "+prenom;
	}
	

}

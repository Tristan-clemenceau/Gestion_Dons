package modele;

import java.io.IOException;

public class DepotVente extends Stockage {
	
	public DepotVente(TypeActivite typeActivite) throws IOException {
		super(typeActivite);
	}

	@Override
	public String toString() {
		return "[DEPOT-VENTE]\n"+super.toString();
	}
	
}

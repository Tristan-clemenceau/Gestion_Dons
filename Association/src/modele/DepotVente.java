package modele;

import java.io.IOException;

public class DepotVente extends Stockage {
	
	public DepotVente() throws IOException {
		super();
	}

	@Override
	public String toString() {
		return "[DEPOT-VENTE]\n"+super.toString();
	}
	
}

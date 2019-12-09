package modele;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Stockage extends PersonneMorale{
	private Date dateDepot;
	private float volumeStockageDisponible;
	private List<Don> listDons = new ArrayList<Don>();
	
	public Stockage() {
		super(TypeActivite.INCONNU);
	}
	
	public Stockage(TypeActivite typeActivite) {
		super(typeActivite);
	}
	
	public Stockage(float volumeStockageDisponible,Date dateDepot) {
		this.volumeStockageDisponible = volumeStockageDisponible;
		this.dateDepot = dateDepot;
	}
	
	public Stockage(float volumeStockageDisponible) {
		this.volumeStockageDisponible = volumeStockageDisponible;
	}
	
	public Stockage(Date dateDepot) {
		this.dateDepot = dateDepot;
	}

	public Date getDateDepot() {
		return dateDepot;
	}

	public void setDateDepot(Date dateDepot) {
		this.dateDepot = dateDepot;
	}

	public float getVolumeStockageDisponible() {
		return volumeStockageDisponible;
	}

	public void setVolumeStockageDisponible(float volumeStockageDisponible) {
		this.volumeStockageDisponible = volumeStockageDisponible;
	}

	public List<Don> getListDons() {
		return listDons;
	}

	public void setListDons(List<Don> listDons) {
		this.listDons = listDons;
	}
	
	public void addDon(Don don) {
		listDons.add(don);
	}

	@Override
	public String toString() {
		return super.toString()+"\tDateDepot : "+dateDepot+"\tVolumeStockageDisponible : "+volumeStockageDisponible+"\t listDons : "+listDons.toString();
	}
	
	
}

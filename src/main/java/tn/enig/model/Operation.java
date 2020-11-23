package tn.enig.model;

public class Operation {
	
	public int id;
	public float  montant;
	
	
	
	public Operation() {
		super();
	}

	public Operation(int id, float montant) {
		super();
		this.id = id;
		this.montant = montant;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public float getMontant() {
		return montant;
	}
	
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	
	
	

}

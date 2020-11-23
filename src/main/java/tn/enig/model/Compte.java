package tn.enig.model;

import java.util.ArrayList;
import java.util.List;

public class Compte {
	
	private int num ;
	private float solde ;
	private Client clt ;
	private List <Operation> operations ;
	
	
	public Compte() {
		super();
	}

	public Compte(int num, float solde, Client clt) {
		super();
		this.num = num;
		this.solde = solde;
		this.clt = clt;
		operations = new ArrayList <Operation>();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}



	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public Client getClt() {
		return clt;
	}

	public void setClt(Client clt) {
		this.clt = clt;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	
	
	
	

}

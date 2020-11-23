package tn.enig.dao;

import java.util.ArrayList;
import java.util.List;

import tn.enig.model.Client;
import tn.enig.model.Compte;
import tn.enig.model.Operation;

public class GestionImp implements IGestion {
	List <Client> listeClients;
	List <Compte> listeComptes;
	
	

	public GestionImp() {
		listeClients = new ArrayList<Client>();
		listeComptes = new ArrayList<Compte>();
	}
	
	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}
	
	public void setListeComptes(List<Compte> listeComptes) {
		this.listeComptes = listeComptes;
	}
	
	public List<Compte> getAllComptes() {
		// TODO Auto-generated method stub
		return listeComptes;
	}

	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return listeClients;
	}
	
	public void addClient(Client c) {
		listeClients.add(c);
		
	}

	public void addCompte(Compte cp) {
		// TODO Auto-generated method stub
		
	}

	public void addOperation(Compte cp, Operation op) {
		// TODO Auto-generated method stub
		
	}

	public Compte getCompteClientById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}




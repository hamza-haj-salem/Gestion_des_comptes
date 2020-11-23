package tn.enig.dao;

import java.util.List;

import tn.enig.model.Client;
import tn.enig.model.Compte;
import tn.enig.model.Operation;

public interface IGestion {
	
	public List<Compte> getAllComptes();
	public List<Client> getAllClients();
	public void addClient(Client c);
	
	public void addCompte(Compte cp);
	public void addOperation(Compte cp, Operation op);
	public Compte getCompteClientById(int id);
	
	

}

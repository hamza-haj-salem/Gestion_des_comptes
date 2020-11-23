package Test;
import java.awt.color.CMMException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.enig.dao.GestionImp;
import tn.enig.dao.IGestion;
import tn.enig.model.Client;
import tn.enig.model.Compte;

import java.awt.color.CMMException;



public class Test {

	public static void main(String[] args) {
		
		ApplicationContext cx= new ClassPathXmlApplicationContext("context.xml");
		IGestion g= cx.getBean("gest1",GestionImp.class);
		System.out.println("les clients sont : ");
		for(Client c:g.getAllClients()) {
			System.out.println(c.getNom());
		}
		
		System.out.println("les comptes sont : ");
		for(Compte c:g.getAllComptes()) {
			System.out.println(c.getNum());
		}
		
		

	}

}

package br.edu.ifce.code;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifce.jpa.Login_account;

public class AddData {

	public static void main(String[] args) {
		EntityManagerFactory conn = Persistence.createEntityManagerFactory("tjw_jpa01");
		EntityManager db = conn.createEntityManager(); 
		
		Login_account login = new Login_account();
			login.setUsername("Cornelli");
			login.setUserpasswd("123");
			
			db.persist(login);
			db.getTransaction().begin();
			db.getTransaction().commit();
	
	}
		

}

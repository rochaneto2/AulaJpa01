package br.edu.ifce.code;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.ifce.jpa.Login_account;

public class ListaData {

	public static void main(String[] args) {
		
		EntityManagerFactory conn = Persistence.createEntityManagerFactory("tjw_jpa01");
			EntityManager db = conn.createEntityManager();
			
			Query query = db.createQuery("Select e From Login_account e");
			
			List<Login_account> all_login = query.getResultList();
			
			for (Login_account e: all_login) {
				System.out.println("Login: " + " " +e.getUsername());
			}
			
			db.close();
			conn.close();
	}

}

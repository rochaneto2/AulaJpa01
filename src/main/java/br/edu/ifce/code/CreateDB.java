package br.edu.ifce.code;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateDB {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tjw_jpa01");
			factory.close();
			System.out.println("Banco criado com Sucesso !");
	}
}

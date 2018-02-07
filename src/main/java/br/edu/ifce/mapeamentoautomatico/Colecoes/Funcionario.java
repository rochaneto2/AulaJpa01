package br.edu.ifce.mapeamentoautomatico.Colecoes;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Persistence;

import br.edu.ifce.jpa.Login_account;

// PROJETO QUE ADC FUNCIONARIO COM VÁRIOS TELEFONEMAS 

@Entity
public class Funcionario {

	@Id
	@GeneratedValue
	private Long id;
	
	private String Nome;
	
// private String telefone
	
	@ElementCollection
	@CollectionTable(name = "Telefones_dos_Funcionarios", joinColumns = @JoinColumn (name = "func_id"))
	@Column(name="telefone")
	private Collection <String> telefones;
	
	
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((telefones == null) ? 0 : telefones.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Funcionario other = (Funcionario) obj;
			if (Nome == null) {
				if (other.Nome != null)
					return false;
			} else if (!Nome.equals(other.Nome))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (telefones == null) {
				if (other.telefones != null)
					return false;
			} else if (!telefones.equals(other.telefones))
				return false;
			return true;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			Nome = nome;
		}

		public Collection<String> getTelefones() {
			return telefones;
		}

		public void setTelefones(Collection<String> telefones) {
			this.telefones = telefones;
		}
		
		public static void main(String[] args) {
			EntityManagerFactory conn = Persistence.createEntityManagerFactory("tjw_jpa01");
			EntityManager db = conn.createEntityManager(); 
			
			Funcionario funcionario = new Funcionario();
				funcionario.setNome("Rocha");
				
				 Collection<String> fone = new ArrayList<String>();
				 fone.add("32875814");
				 fone.add("30553353");
				
				db.persist(funcionario);
				db.getTransaction().begin();
				db.getTransaction().commit();}

	
}

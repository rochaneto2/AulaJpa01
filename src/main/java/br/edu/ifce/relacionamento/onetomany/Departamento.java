package br.edu.ifce.relacionamento.onetomany;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento {
	@Id
	@GeneratedValue
	private long id;
	
	@OneToMany
	private Collection<Empregado> empregados;
	

}

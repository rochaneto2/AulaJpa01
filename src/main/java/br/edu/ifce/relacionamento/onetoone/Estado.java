package br.edu.ifce.relacionamento.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Estado {
	@Id
	@GeneratedValue
	private Long id;
	
	private String estado;
	
	@OneToOne
	private Governador gorvernador;
}

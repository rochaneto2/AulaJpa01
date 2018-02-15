package br.edu.ifce.relacionamento.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Empregado {

	@Id
	@GeneratedValue
	private long id;
	
}

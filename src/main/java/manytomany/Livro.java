package manytomany;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Livro {
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToMany
	private Collection<Autor> autores;
}

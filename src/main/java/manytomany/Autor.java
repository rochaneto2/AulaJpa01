package manytomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.mapping.Collection;

@Entity
public class Autor {

	@Id
	@GeneratedValue
	private long id;
}

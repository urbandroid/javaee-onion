package onion.infrastructure.persistence.entities;

import onion.core.entities.Person;

// @Entity
public class PersonEntity extends Person {

	// @Id
	private Long id;

	public PersonEntity() {

	}

	public PersonEntity(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

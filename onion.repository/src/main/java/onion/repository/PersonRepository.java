package onion.repository;

import java.util.List;

import onion.core.business.objects.Person;

public interface PersonRepository {

	public Person findByName(String name);

	public List<Person> findAllByAgeGreaterThen(int age);

}

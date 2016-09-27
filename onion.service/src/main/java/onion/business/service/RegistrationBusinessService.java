package onion.business.service;

import onion.core.entities.Person;

// Registration Service maps to Registration Process! ;-)
// This is the place to map all the service call definitions from a given process
public interface RegistrationBusinessService {

	public void register(Person p);

}
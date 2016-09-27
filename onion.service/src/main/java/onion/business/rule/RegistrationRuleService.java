package onion.business.rule;

import onion.core.entities.Person;

public interface RegistrationRuleService {

	public boolean checkIfPersonIsOlderThanEighteen(Person p);

}

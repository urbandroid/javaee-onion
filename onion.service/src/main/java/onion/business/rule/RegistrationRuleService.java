package onion.business.rule;

import onion.core.business.objects.Person;

public interface RegistrationRuleService {

	public boolean checkIfPersonIsOlderThanEighteen(Person p);

}

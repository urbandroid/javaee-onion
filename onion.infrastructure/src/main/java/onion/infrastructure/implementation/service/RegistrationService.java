package onion.infrastructure.implementation.service;

import onion.business.rule.RegistrationRuleService;
import onion.business.service.RegistrationBusinessService;
import onion.core.business.objects.Person;

public class RegistrationService implements RegistrationBusinessService, RegistrationRuleService {

	// Business Service
	public void register(Person p) {

	}

	// Business Rule
	public boolean checkIfPersonIsOlderThanEighteen(Person p) {
		if (p.getAge() < 18) {
			return false;
		} else
			return true;
	}

}

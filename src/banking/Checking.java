package banking;

import banking.events.InterestAddedEvent;
import framework.Account;
import framework.DomainEventManager;

public class Checking extends Account {

	final static double RATE = 5.0d / 100;

	@Override
	public void addInterest() {
		super.setCurrentBalance(getCurrentBalance() * RATE);
		// TODO: raise interest added to account event
		DomainEventManager.raise(new InterestAddedEvent(this));
	}

	@Override
	public String getType() {
		return "C";
	}

}

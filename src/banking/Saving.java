package banking;

import banking.events.InterestAddedEvent;
import framework.Account;
import framework.DomainEventManager;

public class Saving extends Account {

	final static double RATE = 10.0d / 100;

	@Override
	public void addInterest() {
		super.setCurrentBalance(getCurrentBalance() * RATE);
		DomainEventManager.raise(new InterestAddedEvent(this));
	}

	@Override
	public String getType() {
		return "S";
	}

}

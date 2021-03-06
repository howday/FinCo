package banking;

import banking.events.InterestAddedEvent;
import finco.Account;
import finco.DomainEventManager;

public class Checking extends Account {

	final static double RATE = 5.0d / 100;

	@Override
	public void addInterest() {
		super.setCurrentBalance(getCurrentBalance() + getCurrentBalance()* RATE);
		DomainEventManager.raise(new InterestAddedEvent(this));
	}

	@Override
	public String getType() {
		return "C";
	}

}

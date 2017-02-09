package banking;

import banking.events.InterestAddedEvent;
import finco.Account;
import finco.DomainEventManager;

public class Saving extends Account {

	final static double RATE = 10.0d / 100;

	@Override
	public void addInterest() {
		super.setCurrentBalance(getCurrentBalance() + getCurrentBalance()* RATE);
		DomainEventManager.raise(new InterestAddedEvent(this));
	}

	@Override
	public String getType() {
		return "S";
	}

}

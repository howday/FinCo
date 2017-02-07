package banking.events;

import framework.IAccount;
import framework.IDomainEvent;

public class InterestAddedEvent implements IDomainEvent {
	public IAccount account;

	public InterestAddedEvent(IAccount acc) {
		account = acc;
	}

	public InterestAddedEvent() {

	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

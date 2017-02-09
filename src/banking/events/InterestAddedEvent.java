package banking.events;

import finco.IAccount;
import finco.IDomainEvent;

public class InterestAddedEvent implements IDomainEvent {
	public IAccount account;

	public InterestAddedEvent(IAccount acc) {
		account = acc;
	}

	public InterestAddedEvent() {

	}

	@Override
	public int hashCode() {
		return getClass().getSimpleName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return getClass().getSimpleName().equals(obj.getClass().getSimpleName());
	}
}

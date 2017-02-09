package finco;

import finco.Account;
import finco.IDomainEvent;

public class DefaultAccountCreatedEvent implements IDomainEvent {
	public Account account;

	public DefaultAccountCreatedEvent(Account acc) {
		account = acc;
	}

	public DefaultAccountCreatedEvent() {

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

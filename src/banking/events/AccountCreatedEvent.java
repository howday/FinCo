package banking.events;

import framework.IAccount;
import framework.IDomainEvent;

public class AccountCreatedEvent implements IDomainEvent {
	public IAccount account;

	public AccountCreatedEvent(IAccount acc) {
		account = acc;
	}

	public AccountCreatedEvent() {

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

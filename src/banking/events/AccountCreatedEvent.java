package banking.events;

import framework.Account;
import framework.IDomainEvent;

public class AccountCreatedEvent implements IDomainEvent {
	public Account account;

	public AccountCreatedEvent(Account acc) {
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

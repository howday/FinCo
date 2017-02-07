package banking.events;

import framework.IAccount;
import framework.IDomainEvent;

public class AccountCreatedEvent implements IDomainEvent{
	public IAccount account;

	public AccountCreatedEvent(IAccount acc) {
		account = acc;
	}
}

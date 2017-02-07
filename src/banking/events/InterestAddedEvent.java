package banking.events;

import framework.Account;
import framework.IAccount;
import framework.IDomainEvent;

public class InterestAddedEvent implements IDomainEvent {
	public IAccount account;

	public InterestAddedEvent(IAccount acc) {
		account = acc;
	}

}

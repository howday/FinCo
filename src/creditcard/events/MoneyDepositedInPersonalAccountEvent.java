package creditcard.events;

import finco.Account;
import finco.IDomainEvent;

public class MoneyDepositedInPersonalAccountEvent implements IDomainEvent {

	public Account account;

	public MoneyDepositedInPersonalAccountEvent(Account acc) {
		account = acc;
	}

	public MoneyDepositedInPersonalAccountEvent() {
		// TODO Auto-generated constructor stub
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

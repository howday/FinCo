package banking.events;

import framework.Account;
import framework.IDomainEvent;

public class MoneyWithdrawInPersonalAccountEvent implements IDomainEvent {
	public Account account;

	public MoneyWithdrawInPersonalAccountEvent(Account acc) {
		account = acc;
	}

	public MoneyWithdrawInPersonalAccountEvent() {
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

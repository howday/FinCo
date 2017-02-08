package banking.handlers;

import banking.events.MoneyWithdrawInPersonalAccountEvent;
import datastructure.DStructure;
import framework.Account;
import framework.IDomainEvent;
import framework.IEventHandler;

public class MoneyWithdrawInPersonalAccontHandler implements IEventHandler {

	@Override
	public void handle(IDomainEvent evt) {
		MoneyWithdrawInPersonalAccountEvent myevt = (MoneyWithdrawInPersonalAccountEvent) evt;

		System.out.println(myevt);
		System.out.println(myevt.account);

		for (Account account : DStructure.getInstance().getList()) {
			System.out.println("MoneyWithdrawInPersonalAccountEvent");
			System.out.println("Money before in handler : " + account.getCurrentBalance());

			if (account.getAccountNumber().equals(myevt.account.getAccountNumber())) {
				System.out.println("Inside");
				account.setCurrentBalance(myevt.account.getCurrentBalance());
			}

			System.out.println("Money after in handler : " + account.getCurrentBalance());
		}
	}

}

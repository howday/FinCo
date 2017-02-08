package banking.handlers;

import banking.events.MoneyDepositedInPersonalAccountEvent;
import datastructure.DStructure;
import framework.Account;
import framework.IDomainEvent;
import framework.IEventHandler;

public class MoneyDepositedInPersonalAccountHandler implements IEventHandler {

	@Override
	public void handle(IDomainEvent evt) {
		MoneyDepositedInPersonalAccountEvent myevt = (MoneyDepositedInPersonalAccountEvent) evt;

		System.out.println("MoneyDepositedInPersonalAccountEvent");
		System.out.println(myevt);
		System.out.println(myevt.account);

		for (Account account : DStructure.getInstance().getList()) {

			if (account.getAccountNumber().equals(myevt.account.getAccountNumber())) {
				double diffAmount = account.getCurrentBalance() - myevt.account.getCurrentBalance();
				account.setCurrentBalance(myevt.account.getCurrentBalance());
				if (Math.abs(diffAmount) > 500) {
					System.out.println("Deposit of sum greater than $500 is performed!!");
					System.out.println("Sending email to : " + myevt.account.getCustomer().getName());
				}
			}
		}

	}

}

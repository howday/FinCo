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
				account.setCurrentBalance(myevt.account.getCurrentBalance());
			}

			double diffAmount = account.getCurrentBalance() - myevt.account.getCurrentBalance();
			System.out.println("Diff: " + diffAmount);
			account.setCurrentBalance(myevt.account.getCurrentBalance());
			if (Math.abs(diffAmount) > 500) {
				System.out.println("Withdrawal of sum greater than $500 is performed!!");
				System.out.println("Sending email to : " + myevt.account.getCustomer().getName());
			}
		}
	}

}

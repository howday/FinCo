package creditcard.handlers;

import banking.events.MoneyWithdrawInPersonalAccountEvent;
import datastructure.DStructure;
import finco.Account;
import finco.IDomainEvent;
import finco.IEventHandler;

public class MoneyWithdrawInPersonalAccontHandler implements IEventHandler {

	@Override
	public void handle(IDomainEvent evt) {
		MoneyWithdrawInPersonalAccountEvent myevt = (MoneyWithdrawInPersonalAccountEvent) evt;

		System.out.println(myevt);
		System.out.println(myevt.account);

		for (Account account : DStructure.getInstance().getList()) {

			System.out.println("MoneyWithdrawInPersonalAccountEvent");
			double diffAmount = account.getCurrentBalance() - myevt.account.getCurrentBalance();
			if (account.getAccountNumber().equals(myevt.account.getAccountNumber())) {
				account.setCurrentBalance(myevt.account.getCurrentBalance());
			}

			
			System.out.println("Diff: " + diffAmount);
			if (Math.abs(diffAmount) > 500) {
				System.out.println("Withdrawal of sum greater than $500 is performed!!");
				System.out.println("Sending email to : " + myevt.account.getCustomer().getName());
			}
		}
	}

}

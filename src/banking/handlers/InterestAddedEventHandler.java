package banking.handlers;

import banking.events.InterestAddedEvent;
import datastructure.DStructure;
import finco.IAccount;
import finco.IDomainEvent;
import finco.IEventHandler;

public class InterestAddedEventHandler implements IEventHandler {

	@Override
	public void handle(IDomainEvent evt) {
		InterestAddedEvent myevt = (InterestAddedEvent) evt;
		for (IAccount account : DStructure.getInstance().getList()) {

			if (account.getAccountNumber().equals(myevt.account.getAccountNumber())) {
				account.setCurrentBalance(myevt.account.getCurrentBalance());
			}

		}
	}

}

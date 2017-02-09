package banking.handlers;

import banking.events.AccountCreatedEvent;
import banking.events.InterestAddedEvent;
import datastructure.DStructure;
import finco.IDomainEvent;
import finco.IEventHandler;

public class AccountCreatedEventHandler implements IEventHandler {
	@Override
	public void handle(IDomainEvent evt) {
		AccountCreatedEvent myevt = (AccountCreatedEvent) evt;

		DStructure dis = DStructure.getInstance();
		
		dis.addAccount(myevt.account);
		

	}
}

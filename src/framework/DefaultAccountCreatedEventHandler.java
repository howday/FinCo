package framework;

import banking.events.AccountCreatedEvent;
import banking.events.InterestAddedEvent;
import datastructure.DStructure;
import framework.IDomainEvent;
import framework.IEventHandler;

public class DefaultAccountCreatedEventHandler implements IEventHandler {
	@Override
	public void handle(IDomainEvent evt) {
		DefaultAccountCreatedEvent myevt = (DefaultAccountCreatedEvent) evt;

		DStructure dis = DStructure.getInstance();
		
		dis.addAccount(myevt.account);
		

	}
}

package banking.handlers;

import banking.events.AccountCreatedEvent;
import banking.events.InterestAddedEvent;
import datastructure.DStructure;
import framework.IDomainEvent;
import framework.IEventHandler;

public class AccountCreatedEventHandler implements IEventHandler {
	@Override
	public void handle(IDomainEvent evt) {
		AccountCreatedEvent myevt = (AccountCreatedEvent) evt;

		DStructure dis = DStructure.getInstance();
		
		dis.addAccount(myevt.account);
		
		System.out.println(dis.getList().get(0).getAccountNumber());
		

	}
}

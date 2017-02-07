package banking.handlers;

import banking.events.InterestAddedEvent;
import framework.IDomainEvent;
import framework.IEventHandler;

public class InterestAddedEventHandler implements IEventHandler {

	@Override
	public void handle(IDomainEvent evt) {
		InterestAddedEvent myevt = (InterestAddedEvent) evt;

		System.out.println("Do anything yo want with me ");
		System.out.println("Do anything yo want with me " + myevt.account.getBalance());

	}

}

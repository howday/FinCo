package framework;

import java.util.HashMap;

import banking.events.AccountCreatedEvent;
import banking.events.InterestAddedEvent;
import banking.handlers.AccountCreatedEventHandler;
import banking.handlers.InterestAddedEventHandler;

public class DomainEventManager {
	
	void register() {
		
	}
	
	public static void  raise(IDomainEvent evt){
		if(evt instanceof InterestAddedEvent)
		{
			(new InterestAddedEventHandler()).handle(evt);
		}
		
		if(evt instanceof AccountCreatedEvent){
			(new AccountCreatedEventHandler()).handle(evt);
		}
	}
	
}

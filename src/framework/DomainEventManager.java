package framework;

import java.util.HashMap;

import banking.events.InterestAddedEvent;
import banking.handlers.InterestAddedEventHandler;

public class DomainEventManager {
	
	void register() {
		
	}
	
	public static void  raise(IDomainEvent evt){
		if(evt instanceof InterestAddedEvent)
		{
			(new InterestAddedEventHandler()).handle(evt);
		}
	}
	
}

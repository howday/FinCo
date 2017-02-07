package framework;

import java.util.HashMap;

import banking.events.AccountCreatedEvent;

import banking.events.InterestAddedEvent;
import banking.handlers.AccountCreatedEventHandler;
import banking.handlers.InterestAddedEventHandler;

public class DomainEventManager {

	static HashMap<IDomainEvent, IEventHandler> handlerStore = new HashMap<>();

	public static void addHandler(IDomainEvent event, IEventHandler handler) {
		System.out.println("Adding handler...");
		handlerStore.put(event, handler);
	}

	void register() {

	}

	public static void raise(IDomainEvent evt) {
		if (evt instanceof InterestAddedEvent) {
			(new InterestAddedEventHandler()).handle(evt);
		}

		if (evt instanceof AccountCreatedEvent) {
			(new AccountCreatedEventHandler()).handle(evt);
		}
	}

}

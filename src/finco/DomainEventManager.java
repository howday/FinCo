package finco;

import java.util.HashMap;

public class DomainEventManager {

	static HashMap<IDomainEvent, IEventHandler> handlerStore = new HashMap<>();

	public static void addHandler(IDomainEvent event, IEventHandler handler) {
		System.out.println("Adding handler...");
		handlerStore.put(event, handler);
	}

	void register() {

	}

	public static void raise(IDomainEvent evt) {
		handlerStore.get(evt).handle(evt);
	}

}

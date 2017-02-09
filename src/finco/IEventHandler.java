package finco;

public interface IEventHandler {

	void handle(IDomainEvent evt);
}

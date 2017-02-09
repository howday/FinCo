package finco;

import banking.Checking;
import banking.Saving;
import banking.events.AccountCreatedEvent;

public class DefaultAccount extends Account {

	public void deposit(double amount) {
		System.out.println("Default account deposited!!");
	}

	public void withdraw(double amount) {
		System.out.println("Default account withdrawn!!");
	}

	public double getBalance() {
		System.out.println("Default account get balance called!!");
		return 0.0d;
	}

	@Override
	public void addInterest() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Default";
	}

	@Override
	public void setCurrentBalance(double balance) {
		// TODO Auto-generated method stub
		
	}

	public static void create(String accountnr, String clientName, String street, String city, String state) {
		DefaultCustomer person = new DefaultCustomer();
		person.setName(clientName);
		person.setStreet(street);
		person.setCity(city);
		person.setState(state);

		Account account = new DefaultAccount();
		account.setCustomer(person);
		account.setAccountNumber(accountnr);
		DomainEventManager.raise(new DefaultAccountCreatedEvent(account));
	}

	
}

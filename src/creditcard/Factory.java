package creditcard;

import banking.Checking;
import banking.Saving;
import banking.events.AccountCreatedEvent;
import finco.Account;
import finco.DomainEventManager;
import finco.Person;

public class Factory {
	public static void create(String accountnr, String clientName, String street, String city, String zip,
			String state, String accountType, String email, String birthDate) {

		System.out.println("Account type in Personal : "+accountType);
		Person person = new Person();
		person.setName(clientName);
		person.setStreet(street);
		person.setCity(city);
		person.setState(state);
		person.setZip(zip);
		person.setEmail(email);
		person.setBirthDate(birthDate);
		
		Account account; 
		if(accountType.equals("Gold"))
			account = new Gold();
		else if(accountType.equals("Silver"))
			account = new Silver();
		else 
			account = new Bronze();
		account.setCustomer(person);
		account.setAccountNumber(accountnr);
		DomainEventManager.raise(new AccountCreatedEvent(account));
	}


}

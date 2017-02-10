package creditcard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import banking.Checking;
import banking.Saving;
import banking.events.AccountCreatedEvent;
import finco.Account;
import finco.DomainEventManager;
import finco.Entry;
import finco.IEntry;
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
		List<IEntry> lst= new ArrayList<IEntry>();
		Random rand = new Random();
		ArrayList<String> a= new ArrayList<String>();
		a.add("Shopping");
		a.add("Food");
		a.add("SportsKit");
		a.add("WallmartShopping");
		a.add("Hyvee Shopping");
		a.add("Car Repair");
		int sum=0;
		for(int i=0; i<4; i++)
		{
			 int  Amount = rand.nextInt(100) + 1;
			 int index=rand.nextInt(5);
			 sum=sum+Amount;
			 lst.add(new Entry(Amount, a.get(index)));
		}
		Account account; 
		if(accountType.equals("Gold"))
			account = new Gold();
		else if(accountType.equals("Silver"))
			account = new Silver();
		else 
			account = new Bronze();
		account.setCustomer(person);
		account.setAccountNumber(accountnr);
		account.setEntryList(lst);
		account.setCurrentBalance(sum);
		DomainEventManager.raise(new AccountCreatedEvent(account));
	}


}

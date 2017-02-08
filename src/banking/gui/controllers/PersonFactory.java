package banking.gui.controllers;

import banking.Checking;
import banking.Saving;
import framework.Account;
import framework.IAccount;
import framework.Person;

public class PersonFactory {

	public static IAccount create(String accountnr, String clientName, String street, String city, String zip,
			String state, String accountType, String email, String birthDate) {
		Person person = new Person();
		person.setName(clientName);
		person.setStreet(street);
		person.setCity(city);
		person.setState(state);
		person.setZip(zip);
		person.setEmail(email);
		person.setBirthDate(birthDate);

		Account account = accountType.equals("Checking") ? new Checking() : new Saving();
		account.setCustomer(person);
		account.setAccountNumber(accountnr);
		return account;
	}
}

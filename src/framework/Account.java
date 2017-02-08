package framework;

import java.util.ArrayList;
import java.util.List;

import banking.Checking;
import banking.Saving;
import banking.events.AccountCreatedEvent;
import banking.events.MoneyDepositedInPersonalAccountEvent;

public abstract class Account implements IAccount ,Cloneable{

	List<IEntry> entryList = new ArrayList<>();
	double rate;
	double currentBalance = 1.0d;
	String accountNumber;
	Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<IEntry> getEntryList() {
		return entryList;
	}

	public void setEntryList(List<IEntry> entryList) {
		this.entryList = entryList;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public void deposit(double amount) {
		if ("P".equals(customer.getCustomerType()) && amount > 500) {
			// TODO: raise AmountExceedRequested event
		}
		currentBalance += amount;

		DomainEventManager.raise(new MoneyDepositedInPersonalAccountEvent(this));
		// TODO: raise amount deposit event
		System.out.println("deposited!!");
	}

	public void withdraw(double amount) {

		if ("P".equals(customer.getCustomerType()) && amount > 500) {
			// TODO: raise AmountExceedRequested event
		}

		if (amount > getCurrentBalance()) {
			// TODO: raise InSufficientAmountRequested event
		}
		currentBalance -= amount;
		// TODO: raise amount withdrawn event
		System.out.println("withdrawn!!");
	}

	public static void create(String accountnr, String clientName, String street, String city, String zip, String state,
			String accountType, String email, String birthDate) {
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
		DomainEventManager.raise(new AccountCreatedEvent(account));
	}

	public double getBalance() {
		System.out.println("get balance called!!");
		return 0.0d;
	}

	public void addEntry(IEntry entry) {
		entryList.add(entry);
	}
	
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

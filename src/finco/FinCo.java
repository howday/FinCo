package finco;

import java.util.List;
import java.util.Optional;

import javax.swing.UIManager;

import datastructure.DStructure;

public class FinCo {
	List<Account> accounts;

	public FinCo() {
		DStructure dis = DStructure.getInstance();
		this.accounts = dis.getList();
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public void addInterestToAllAccounts() {
		accounts.forEach(a -> a.addInterest());
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void createAccount(Customer customer, Account account) {

	}

	public void deposit(double amount, Account account) {
		System.out.println("Current Balance: " + account.getCurrentBalance());
		IEntry entry = new Entry(amount, account.getCustomer().getName());
		account.addEntry(entry);
		account.deposit(amount);

		Optional<Account> aa = DStructure.getInstance().getList().stream()
				.filter(acc -> acc.getAccountNumber().equals(account.getAccountNumber())).findFirst();

		if (aa.isPresent()) {
			System.out.println("After Balance: " + aa.get().getCurrentBalance());
		}

	}
	
	public void withdraw(double amount, Account account) {
		System.out.println("Current Balance: "+account.getCurrentBalance());
		IEntry entry = new Entry(amount, account.getCustomer().getName());
		account.addEntry(entry);
		account.withdraw(amount);

		
		Optional<Account> aa = DStructure.getInstance().getList().stream()
				.filter(acc -> acc.getAccountNumber().equals(account.getAccountNumber())).findFirst();

		if (aa.isPresent()) {
		System.out.println("After Balance: "+aa.get().getCurrentBalance());
		}

	}

	static public void main(String args[])
	{
		DomainEventManager.addHandler(new DefaultAccountCreatedEvent(), new DefaultAccountCreatedEventHandler());
		try {
		    // Add the following code if you want the Look and Feel
		    // to be set to the Look and Feel of the native system.
		    
		    try {
		        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } 
		    catch (Exception e) { 
		    }
		    
			//Create a new instance of our application's frame, and make it visible.
			(new FinCoUI()).setVisible(true);
		} 
		catch (Throwable t) {
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}
}

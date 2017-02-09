package finco;

/**
 * Interface for account and its hierarchy
 * 
 * @author suresh
 *
 * 
 */
public interface IAccount {

	void deposit(double amount);

	void withdraw(double amount);

	double getCurrentBalance();

	void addInterest();

	String getType();

	String getAccountNumber();

	Customer getCustomer();
	
	void setCurrentBalance(double currentBalance);

}

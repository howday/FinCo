package framework;

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

	double getBalance();
	
	void addInterest();
	
	String getType();


}

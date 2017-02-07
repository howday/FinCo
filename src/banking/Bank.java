package banking;

import java.util.ArrayList;
import java.util.List;

import framework.DefaultAccount;
import framework.IAccount;

public class Bank {

	List<IAccount> accounts;

	public Bank() {
		this.accounts = new ArrayList<>();
		IAccount acc=new DefaultAccount();
		accounts.add(acc);
		}

	public void addAccount(IAccount account) {
		accounts.add(account);
	}

	public void addInterestToAllAccounts() {
		accounts.forEach(a -> a.addInterest());
	}
	public List<IAccount> getAccounts()
	{
		return accounts;
	}

}

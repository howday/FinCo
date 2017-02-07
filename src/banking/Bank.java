package banking;

import java.util.ArrayList;
import java.util.List;

import framework.IAccount;

public class Bank {

	List<IAccount> accounts;

	Bank() {
		this.accounts = new ArrayList<>();
	}

	public void addAccount(IAccount account) {
		accounts.add(account);
	}

	public void addInterestToAllAccounts() {
		accounts.forEach(a -> a.addInterest());
	}

}

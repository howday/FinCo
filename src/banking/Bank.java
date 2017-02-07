package banking;

import java.util.ArrayList;
import java.util.List;

import datastructure.DStructure;
import framework.DefaultAccount;
import framework.IAccount;

public class Bank {

	List<IAccount> accounts;

	public Bank() {
		DStructure dis=DStructure.getInstance();
		this.accounts = dis.getList();
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

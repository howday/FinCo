package framework;

import java.util.List;

public abstract class Account implements IAccount {

	List<IEntry> entryList;

	public void deposit(double amount) {
		System.out.println("deposited!!");
	}

	public void withdraw(double amount) {
		System.out.println("withdrawn!!");
	}

	public double getBalance() {
		System.out.println("get balance called!!");
		return 0.0d;
	}

}

package framework;

import java.util.List;

public abstract class Account implements IAccount {

	List<IEntry> entryList;
	double rate;
	double currentBalance;

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

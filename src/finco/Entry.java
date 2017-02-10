package finco;

import java.time.LocalDate;

public class Entry implements IEntry {

	public Entry(double amount, String name) {
		this.date = LocalDate.now();
		this.amount = amount;
		this.depositerName = name;
	}

	private LocalDate date;
	private double amount;
	private IAccount account;
	private String depositerName;

	@Override
	public LocalDate getDate() {
		return date;
	}

	@Override
	public double getAmount() {
		return amount;
	}

	@Override
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public void setAccount(IAccount account) {
		this.account = account;
	}

	@Override
	public IAccount getAccount() {
		return account;
	}

	@Override
	public String getDepositerName() {
		// TODO Auto-generated method stub
		return depositerName;
	}

}
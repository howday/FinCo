package banking;

import framework.Account;

public class Saving extends Account {

	final static double RATE = 10.0d / 100;

	@Override
	public void addInterest() {
		super.setCurrentBalance(getCurrentBalance() * RATE);
	}

	@Override
	public String getType() {
		return "S";
	}

}

package banking;

import framework.Account;

public class Checking extends Account {

	final static double RATE = 5.0d / 100;

	@Override
	public void addInterest() {
		super.setCurrentBalance(getCurrentBalance() * RATE);
		// TODO: raise interest added to account event
	}
	
	@Override
	public String getType() {
		return "C";
	}

}

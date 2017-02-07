package banking.gui.controllers;

import framework.DefaultAccount;
import framework.IAccount;

public class PersonFactory {

	public static IAccount create(String accountnr,String clientName, String street,String city,String zip, String state,String accountType){
		return new DefaultAccount();
	}
}

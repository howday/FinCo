package framework;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer implements ICustomer {

	List<IAccount> accountList = new ArrayList<>();

	public void addAccount() {
		System.out.println("adding from abstract!!");
	}

	public void removeAccount() {
		System.out.println("removing from abstract!!");
	}
}

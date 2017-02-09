package finco;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer implements ICustomer {

	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<IAccount> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<IAccount> accountList) {
		this.accountList = accountList;
	}

	List<IAccount> accountList = new ArrayList<>();

	public void addAccount() {
		System.out.println("adding from abstract!!");
	}

	public void removeAccount() {
		System.out.println("removing from abstract!!");
	}
}

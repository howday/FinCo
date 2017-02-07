package framework;

import java.util.Date;

public class Person extends Customer implements IPerson {
	
	private Date birthDate;


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public void getBirthDate() {
		System.out.println("getting birth from Person!!");

	}

	@Override
	public void setBirthDate() {
		System.out.println("setting birth from Person!!");

	}

	@Override
	public String getCustomerType() {
		// TODO Auto-generated method stub
		return "P";
	}

}

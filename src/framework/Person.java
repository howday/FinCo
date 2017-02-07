package framework;

public class Person extends Customer implements IPerson {

	private String birthDate;

	@Override
	public String getCustomerType() {
		// TODO Auto-generated method stub
		return "P";
	}

	@Override
	public String getBirthDate() {
		return this.birthDate;
	}

	@Override
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;

	}

}

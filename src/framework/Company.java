package framework;

public class Company extends Customer implements IPerson {

	private int numberOfEmployees;

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public void getBirthDate() {
		System.out.println("getting birth from Company!!");

	}

	@Override
	public void setBirthDate() {
		System.out.println("setting birth from Company!!");

	}

	@Override
	public String getCustomerType() {
		// TODO Auto-generated method stub
		return "C";
	}

}

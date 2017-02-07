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
	public String getCustomerType() {
		// TODO Auto-generated method stub
		return "C";
	}

	@Override
	public String getBirthDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBirthDate(String birthDate) {
		// TODO Auto-generated method stub
		
	}

}

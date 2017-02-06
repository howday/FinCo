package framework;

public class Person extends Customer implements IPerson {

	@Override
	public void getBirthDate() {
		System.out.println("getting birth from Person!!");

	}

	@Override
	public void setBirthDate() {
		System.out.println("setting birth from Person!!");

	}

}

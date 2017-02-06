package framework;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Framework!!");

		IAccount account = new DefaultAccount();
		account.getBalance();

		ICustomer a = new Person();
		a.addAccount();

	}

}

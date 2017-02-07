package connection;

public class TempDataStore implements DBPool{

	@Override
	public void getConnection() {
		System.out.println("Temporary Data storage created!!");
	}

}

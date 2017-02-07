package connection;

public class MySqlDB implements DBPool {

	@Override
	public void getConnection() {
		System.out.println("MySQL Connection created!!");

	}

}

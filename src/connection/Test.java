package connection;

public class Test {

	public static void main(String[] args) {

		DBContext context = new DBContext(new TempDataStore());
		context.execute();
		context.setDBPool(new MySqlDB());
		context.execute();
	}

}

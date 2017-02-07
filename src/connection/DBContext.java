package connection;

public class DBContext {

	private DBPool dbPool;

	public DBContext(DBPool pool) {
		this.dbPool = pool;
	}

	public void setDBPool(DBPool pool) {
		this.dbPool = pool;
	}

	public void execute() {
		dbPool.getConnection();
	}

}

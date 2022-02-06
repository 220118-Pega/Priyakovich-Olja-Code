package NewProject0.storage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;




public class ConnectionFactory {
	private static final ConnectionFactory connectionFactory = new ConnectionFactory();
	private Properties props = new Properties();

	// specific to the class functionality (Not all singleton has static blocks)

	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private ConnectionFactory() {
		try {
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			props.load(loader.getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ConnectionFactory getInstance(){
		return connectionFactory;
	}

	
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(props.getProperty("user"), props.getProperty("password"),
					props.getProperty("url"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}

	
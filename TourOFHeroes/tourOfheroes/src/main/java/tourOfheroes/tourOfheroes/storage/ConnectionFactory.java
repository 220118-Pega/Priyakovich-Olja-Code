package tourOfheroes.tourOfheroes.storage;

import java.util.Properties;

public class ConnectionFactory {
	private static final ConnectionFactory connectionfactory = ConnectionFactory();
	private Properties props;
	
	private ConnectionFactory() {
		
	}

	private static ConnectionFactory ConnectionFactory() {
		try {
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			props.load(loader.getResource("db.properties"));
		}catch (IOExeption e) {
			e.printStackTrace();
		}
	}
}

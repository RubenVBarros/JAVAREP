package conv;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {

	public static void main(String[] args) {
		try {
			int port = 8040;
			LocateRegistry.createRegistry(port);
			Naming.rebind("rmi://localhost:8040/Conv", new Conv());
			System.out.println("Serveur pret ! .");
		} catch (Exception e) {
			System.out.println("Serveur échec " + e);
		}

	}

}

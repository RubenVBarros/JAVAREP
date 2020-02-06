import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class Serveur {

	public static void main(String[] args) {
		try {
			int port = 8000;
			LocateRegistry.createRegistry(port);
			Naming.rebind("rmi://localhost:8000/hello", new HelloImpl());
			System.out.println("Hello Server pret ! .");
		} catch (Exception e) {
			System.out.println("Hello Server échec " + e);
		}

	}

}

package serveur;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import client.Mot;

public class Serveur {

	public static void main(String[] args) {
		try {
			int port = 8107;
			LocateRegistry.createRegistry(port);
			Naming.rebind("rmi://localhost:8107/Mot", new Mot());
			System.out.println("Serveur pret !");
			
		} catch(Exception e) {
			System.out.println("Serveur échec " + e);
		}

	}

}

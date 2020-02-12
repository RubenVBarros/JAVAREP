package compte;

import java.rmi.Naming;

public class Client {

	public static void main(String[] args) {
		try {
			BanqueInterface obj = (BanqueInterface) Naming.lookup("rmi://localhost:8106/Compte");
			obj.retirer("4",200);
			obj.ajouter("4",100.0);
	} catch(Exception e) {
		System.out.println("Banque Client exception: " + e);
		}

	}

}

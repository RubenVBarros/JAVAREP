package client;

import java.rmi.Naming;

public class Client {

	public static void main(String[] args) {
		try {
			//int port = 8107;
			MotInterface obj = (MotInterface) Naming.lookup("rmi://localhost:8107/Mot");
			obj.Execution();
		} catch(Exception e) {
			System.out.println("Mot client exception" + e);
		}

	}

}

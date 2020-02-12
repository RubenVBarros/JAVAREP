package pendu;

import java.rmi.Naming;
public class Client {

	public static void main(String[] args) {
		try {
			MotInterface obj = (MotInterface) Naming.lookup("rmi://localhost:8107/Mot");
			obj.deviner();
	} catch(Exception e) {
		System.out.println("Mot Client exception: " + e);
		}

	}

}

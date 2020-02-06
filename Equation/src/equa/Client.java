package equa;

import java.rmi.Naming;

public class Client {

	public static void main(String[] args) {
		try {
			//int port = 8000;
			EquaInterface obj = (EquaInterface) Naming.lookup("rmi://localhost:8106/Equa");
			obj.solution();
	} catch(Exception e) {
		System.out.println("Equation Client exception: " + e);
		}
		

	}

}

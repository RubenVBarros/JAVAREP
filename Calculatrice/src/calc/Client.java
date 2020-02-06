package calc;

import java.rmi.Naming;

public class Client {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		try {
			CalculateurInterface obj = (CalculateurInterface) Naming.lookup("rmi://localhost:8106/Calc");
			obj.add(a,b);
	} catch(Exception e) {
		System.out.println("Calcul Client exception: " + e);
		}

	}
}

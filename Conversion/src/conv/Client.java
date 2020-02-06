package conv;

import java.rmi.Naming;

public class Client {

	public static void main(String[] args) {
		try {
			//int port = 8000;
			ConvInterface obj = (ConvInterface) Naming.lookup("rmi://localhost:8040/Conv");
			obj.celsiusFahreneit();
	} catch(Exception e) {
		System.out.println("Conversion Client exception: " + e);
		}

	}

}

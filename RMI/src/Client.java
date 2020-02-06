import java.rmi.*;

public class Client {

	public static void main(String[] args) {
		try {
			HelloInterface obj = (HelloInterface) Naming.lookup("rmi://localhost:8000/hello");
			System.out.println(obj.echo());
	} catch(Exception e) {
		System.out.println("HelloClient exception: " + e);
		}

	}
}

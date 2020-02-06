package equa;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.lang.Math;

public class Equation extends UnicastRemoteObject implements EquaInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4072763823135873577L;
	private Scanner sc;

	protected Equation() throws RemoteException {
		super();
	}

	@Override
	public void solution() throws RemoteException {
		sc = new Scanner(System.in);
		double res = 0;
		System.out.println("Mettez votre A!");
		double a = sc.nextDouble();

		System.out.println("Mettez votre B!");
		double b = sc.nextDouble();

		System.out.println("Mettez votre C!");
		double c = sc.nextDouble();
		
		double delta = b * b - 4 * a * c;
		
		if(delta < 0) {
			System.out.println("Il n'y a pas de solution");
			
		}
		else if(delta  == 0) {
			System.out.println("Il y'a une seule solution");
			res = -b/2 * a;
			System.out.println("Le résultat est " + res);
		}
		else {
			double res2 = 0;
			System.out.println("Il y'a deux solution");
			res = -b - Math.sqrt(delta) / 2 * a; 
			res2 = -b + Math.sqrt(delta) / 2 * a;
			System.out.println("Le résultat numéro 1 est " + res);
			System.out.println("Le résultat numéro 2 est " + res2);
			
		}
	}
	

}

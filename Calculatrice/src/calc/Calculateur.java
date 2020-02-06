package calc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculateur extends UnicastRemoteObject implements CalculateurInterface{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3333156749641910751L;

	public Calculateur() throws RemoteException {
		super();
	}

	@Override
	public void add(double a, double b) throws RemoteException {
		double res = a + b;
		System.out.println(res);
	}

	@Override
	public void sub(double a, double b) throws RemoteException {
		double res = a - b;
		System.out.println(res);
	}

	@Override
	public void mul(double a, double b) throws RemoteException {
		double res = a * b ;
		System.out.println(res);
	}

	@Override
	public void div(double a, double b) throws RemoteException {
		double res = a / b;
		System.out.println(res);
	}
}

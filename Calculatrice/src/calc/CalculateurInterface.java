package calc;
import java.rmi.*;

public interface CalculateurInterface extends Remote{
	public void add(double a,double b)throws RemoteException;
	public void sub(double a,double b)throws RemoteException;
	public void mul(double a,double b)throws RemoteException;
	public void div(double a,double b)throws RemoteException;
}

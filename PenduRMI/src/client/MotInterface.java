package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MotInterface extends Remote{
	void Pendu(String motadeviner)throws RemoteException;
	void Execution()throws RemoteException;
	
}

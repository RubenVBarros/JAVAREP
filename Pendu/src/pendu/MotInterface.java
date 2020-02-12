package pendu;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MotInterface extends Remote{
	void deviner()throws RemoteException;
	
}

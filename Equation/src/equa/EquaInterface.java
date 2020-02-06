package equa;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EquaInterface extends Remote{
	public void solution() throws RemoteException;
}

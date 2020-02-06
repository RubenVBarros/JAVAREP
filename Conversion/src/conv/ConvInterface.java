package conv;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ConvInterface extends Remote{
	public void convTemperature() throws RemoteException;
	
	//Variantes aves 2 méthodes celsius->fahr fahr->celsius :
	public void celsiusFahreneit()throws RemoteException;
	public void fahreneitCelsius()throws RemoteException;
}

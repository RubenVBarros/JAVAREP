import java.rmi.*;
import java.rmi.server.*;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4533631848845755716L;
	public HelloImpl() throws RemoteException {
		super();
	}
	public String echo() throws RemoteException{
		return "Hello World";
	}
}

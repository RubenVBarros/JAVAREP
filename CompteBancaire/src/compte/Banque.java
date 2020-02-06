package compte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Banque extends UnicastRemoteObject implements BanqueInterface{

	/**
	 * 
	 */
	Compte c = new Compte();
	private static final long serialVersionUID = -5881209176719487544L;

	protected Banque() throws RemoteException {
		super();
	}

	@Override
	public void ajouter(String id, double somme) {
		// TODO Stub de la méthode généré automatiquement
		
	}

	@Override
	public void retirer(String id, double somme) {
		// TODO Stub de la méthode généré automatiquement
		
	}

	@Override
	public Position position(String id) {
		// TODO Stub de la méthode généré automatiquement
		return null;
	}
	
	

}

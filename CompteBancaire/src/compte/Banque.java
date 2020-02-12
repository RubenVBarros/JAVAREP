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
		c.setSolde(id,somme);
	}

	@Override
	public void retirer(String id, double somme) {
		c.setSolde(id,somme);
	}

	@Override
	public Position position(String id) {
		return new Position(id,c.getSolde(id));
		
	}

	@Override
	public void creerCompte(String id, double somme) throws RemoteException {
		c.addCompte(id,somme);
	}
	
	

}

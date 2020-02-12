package compte;

import java.rmi.RemoteException;

public interface BanqueInterface {
	void creerCompte(String id, double somme) throws RemoteException;
	void ajouter(String id,double somme)throws RemoteException;
	void retirer(String id,double somme)throws RemoteException;
	Position position(String id);
}

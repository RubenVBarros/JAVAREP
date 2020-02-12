package compte;

import java.util.Hashtable;

public class Compte{
	Hashtable<String,Double>banque = new Hashtable<String,Double>();
	
	public Compte() {
		
	}
	
	public void addCompte(String id,double somme) {
		banque.put(id,somme);
	}
	public void setSolde(String id, double somme) {
		banque.replace(id,somme);
	}
	public double getSolde(String id) {
		return banque.get(id).doubleValue();
	}
}

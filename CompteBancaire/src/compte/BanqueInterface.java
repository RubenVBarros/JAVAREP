package compte;

public interface BanqueInterface {
	void ajouter(String id,double somme);
	void retirer(String id,double somme);
	Position position(String id);
}

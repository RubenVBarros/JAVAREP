package pendu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class Mot extends UnicastRemoteObject implements MotInterface{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8227435171247389648L;
	private Scanner sc = new Scanner(System.in);
	
	public Mot() throws RemoteException{
		super();
	}

	@Override
	public void deviner() throws RemoteException {
		System.out.println("Bienvenue sur le jeu du pendu !");
		System.out.println("La partie va commencer");
		int chance = 9;
		File fichier = new File("/home/barros4u/workspace/Pendu/src/pendu/mot.txt");
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fichier));
		} catch (FileNotFoundException e1) {
			System.out.println("Votre fichier n'est pas là");
			e1.printStackTrace();
		}
		
		@SuppressWarnings("unused")
		String chaine;
		try {
			while((chaine = br.readLine()) != null) {
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println("Votre fichier ne contient rien, problème !");
			e.printStackTrace();
		}
		
		while(chance < 9) {
			System.out.println("Quelle lettre voulez vous révéler ?");
			String lettre = sc.nextLine();
			String lettrereveler = "";
			if(lettre == lettrereveler) {
				System.out.println("Vous avez déjà donner cette lettre et toute les lettres ont été révélés");
			}
			else
			{
				//faire en sorte que on révéle les lettres
			}
			String lettreadeviner="";//buffer du mot qu'on devine
			if(lettre != lettreadeviner) {
				chance -= 1 ;
				System.out.println("Cette lettre ne fait pas parti du mot vous avez " + chance + " chances");
			}
		}
		if(chance == 0) {
			System.out.println("Vous avez perdu, dommage ce sera pour une prochaine fois");
		}
	}
}

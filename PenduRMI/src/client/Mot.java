package client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class Mot extends UnicastRemoteObject implements MotInterface{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6930328639523631790L;
	String[] motadeviner = {"orange","résoudre","avion"};
	String mot = motadeviner[(int) (Math.random() * motadeviner.length)]; //mot aleatoire
	String asterisk = new String(new char[mot.length()]).replace("\0", "*");
	int rate = 0;//le nb de chances rat� dans le jeu, on a le droit � 9 Chances
	
	public Mot () throws RemoteException{
		super();
	}
	
	@Override
	public void Execution() throws RemoteException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue sur le jeu du pendu !");
		System.out.println("La partie va commencer");
		
		while(rate < 7 && asterisk.contains("*")) {
			System.out.println("Quelle lettre voulez vous r�v�ler ?");
			System.out.println(asterisk);
			String motadeviner = sc.next();
			Pendu(motadeviner);
		}
		if(rate == 7) {
			System.out.println("Vous avez perdu, r�essayez la prochaine fois");
		}
		sc.close();
	}

	@Override
	public void Pendu(String motadeviner) throws RemoteException{
		//int rate = 0;//le nb de chances rat� dans le jeu, on a le droit � 9 Chances
		String nasterisk = "";
		for(int i = 0;i < mot.length();i++) {
			if(mot.charAt(i) == motadeviner.charAt(0)) {
				nasterisk += motadeviner.charAt(0);
			}
			else if(asterisk.charAt(i) != '*') {
				nasterisk += mot.charAt(i);
			}
			else {
				nasterisk += "*";
			}
		}
		
		if(asterisk.equals(nasterisk)) {
			rate++;
		}
		else {
			asterisk = nasterisk;
		}
		
		if(asterisk.equals(mot)) {
			System.out.println("Bravo, vous avez trouv� le mot, qui �tait : " + mot );
		}
	}

}

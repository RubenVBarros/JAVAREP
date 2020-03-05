package pendu;

import java.util.Scanner;

public class mot {
	
	private static String[] motadeviner = {"orange","résoudre","avion"};
	private static String mot = motadeviner[(int) (Math.random() * motadeviner.length)]; //mot aleatoire
	private static String asterisk = new String(new char[mot.length()]).replace("\0", "*");
	private static int rate = 0;//le nb de chances raté dans le jeu, on a le droit à 9 Chances

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue sur le jeu du pendu !");
		System.out.println("La partie va commencer");
		
		while(rate < 9 && asterisk.contains("*")) {
			System.out.println("Quelle lettre voulez vous révéler ?");
			System.out.println(asterisk);
			String motadeviner = sc.next();
			pendu(motadeviner);
		}
		if(rate == 9) {
			System.out.println("Vous avez perdu, réessayez la prochaine fois");
		}
		sc.close();

	}
	
	public static void pendu(String motadeviner) {
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
			System.out.println("Bravo, vous avez trouvé le mot, qui était : " + mot );
		}

	}
}

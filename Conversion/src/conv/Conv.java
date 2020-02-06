package conv;
import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;

public class Conv extends UnicastRemoteObject implements ConvInterface{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7223262863312484215L;
	private Scanner sc;

	protected Conv() throws RemoteException{
		super();
	}
	
	public void convTemperature() throws RemoteException{
		sc = new Scanner(System.in);
		double res = 0;
		System.out.println("Quel nombre voulez vous mettre ?");
		double x = sc.nextDouble();
		
		if(x != (double)x) {
			/*while(x != (double)x)
				System.out.println("Quel nombre voulez vous mettre ?");*/
			System.out.println("Ce n'est pas un nombre, essayez la prochaine fois !");
		}
		else {
			System.out.println("Voulez vous convertir de Celsius à Fahreneit(1) ou l'inverse(2)");
			int y = sc.nextInt(); 
			if(y == 1) {
				res = x *9/5 + 32;
				System.out.println("Le résultat est :");
				System.out.println(res);
			}
			else {
				res = (x-32) * 5/9;
				System.out.println("Le résultat est :");
				System.out.println(res);
			}
		}
	}
	
	public void celsiusFahreneit() throws RemoteException{
		sc = new Scanner(System.in);
		double res = 0;
		System.out.println("Quel nombre voulez vous mettre ?");
		double x = sc.nextDouble();
		
		if(x != (double)x) {
			/*while(x != (double)x)
				System.out.println("Quel nombre voulez vous mettre ?");*/
			System.out.println("Ce n'est pas un nombre, essayez la prochaine fois !");
		}
		else {
				res = x *9/5 + 32;
				System.out.println("Le résultat est :");
				System.out.println(res);
			}
		}
	
	public void fahreneitCelsius() throws RemoteException{
		sc = new Scanner(System.in);
		double res = 0;
		System.out.println("Quel nombre voulez vous mettre ?");
		double x = sc.nextDouble();
		
		if(x != (double)x) {
			/*while(x != (double)x)
				System.out.println("Quel nombre voulez vous mettre ?");*/
			System.out.println("Ce n'est pas un nombre, essayez la prochaine fois !");
		}
		else {
				res = (x-32) * 5/9;
				System.out.println("Le résultat est :");
				System.out.println(res);
			}
		}
	}

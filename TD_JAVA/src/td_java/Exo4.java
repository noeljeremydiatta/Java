package td_java;

import java.util.Scanner;
public class Exo4 {

	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.print("Saisir la valeur du r�el x: ");
		float reel = val.nextFloat();
		System.out.print("Saisir la valeur de l'esntier n: ");
		int entier = val.nextInt();
		val.close();
		
		int puissance = pow(reel,entier);
		System.out.println(reel +" � la puissance " + entier + " est: " + puissance );
	}

	private static int pow(float reel, int entier) {
		// TODO Auto-generated method stub
		return 0;
	}
}

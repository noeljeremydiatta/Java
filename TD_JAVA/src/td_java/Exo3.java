package td_java;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		
		Scanner valeur = new Scanner(System.in);
		System.out.print("Saisir la valeur de la r�sistance: ");
		float r1 = valeur.nextFloat();
		System.out.print("Saisir la valeur de la r�sistance: ");
		float r2 = valeur.nextFloat();	
		System.out.print("Saisir la valeur de la r�sistance: ");
		float r3 = (float)valeur.nextFloat();	
		System.out.print("Pr�cisez votre choix en tapant 1 ou 2: ");
		int choice = valeur.nextInt();
		valeur.close();
			
			float rs = r1 + r2 + r3;
			float rp = ((r1 * r2 * r3) / (r1 * r2 + r2 * r3 + r3 * r1));

				if (choice == 1) {
				    System.out.println("la fr�quence en s�rie est: "+ rs);
				}
					else
					System.out.println("la fr�quence en parall�le est: "+ rp);


	}

}

package td_java;

import java.util.Scanner;

public class Exo1 {

	public static void main(String[] args) {
		float A,B;
		do {
		Scanner nombre = new Scanner(System.in);
		System.out.print( "Saisissez la valeur de a: ");
		 A = nombre.nextInt( );
		System.out.print( "Saisissez la valeur de b: ");
		  B = nombre.nextInt( );
		  nombre.close();
		} while(A <= 0 && B <= 0);
		
		int quotient = (int) (A / B);
		float quotient1 = A / B;
		int r = (int) (A % B);
		int r1 = 0 ;
		if (r == 0) {
		System.out.println("le quotient entier da la divison est: "+ quotient);
		System.out.println("le reste de la division est: "+ r);
		}
	
		else {
			System.out.println("le quotient r�el de la division est: "+ quotient1);
			System.out.println("le quotient de la division enti�re est: "+ r1);
		}
		
		
	}
}



package td_java;
import java.util.Scanner;
public class Exo2 {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in);
		System.out.print( "Saisir la valeur du rayon du cercle: ");
		 float rayon = donnee.nextFloat( );
		  donnee.close();	
		  float pi = (float) 3.14;
		float perimetre = 2 * pi * rayon;
		float surface = pi *rayon*rayon;
		System.out.println("le p�rimetre du cerlce est: "+ perimetre + " cm" + " et sa surface est: "+ surface + " cm�");
		  

	}

}

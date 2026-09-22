package et1.tiposdatos;
import java.util.Scanner;

/*Solicite al usuario dos vectores tridimensionales e imprima su producto escalar.*/
public class E8 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int[] vector1 = new int[3];
		int[] vector2 = new int[3];
		
		int suma=0;
		
		
		
		int numero;
		System.out.println("Escribe el primer vector tridimensional:");
		System.out.println("1º vector");
		for(int i=0; i<3; i++) {
			System.out.println((i+1) + "º término:");
			
			vector1[i]=sc.nextInt();
			
		}
		
		System.out.println("2º vector");
		for(int j=0; j<3; j++) {
			System.out.println((j+1) + "º término:");
			
			vector2[j]=sc.nextInt();
			
		}
		
		for(int k=0; k<3; k++) {
			suma+=vector1[k]*vector2[k];
		}
		
		System.out.print("El producto escalar de los dos vectores es: " + suma);
		
	}

}

package et1.arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


/*Tome un array de floats y devuelva la suma de todos sus elementos.*/
public class E1 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		List<Float> lista = new ArrayList<Float>();
		
		System.out.println("Escribe una serie de números(escribe 0 para dar por terminada la serie):");
		
		float numero=0;
		float suma=0;
		boolean b = true;
		while(b) {
			numero = sc.nextFloat();
			if(numero == 0) {
				b = false;
			}else {
			lista.add(numero);
			}
		}
		
		for(int i=0; i < lista.size() ; i++) {
			suma+=lista.get(i);
		}
		System.out.println("La suma de la serie es: " + suma);
		
		
		sc.close();
		
	}
}

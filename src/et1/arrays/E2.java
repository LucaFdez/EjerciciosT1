package et1.arrays;
import java.util.Scanner;

public class E2 {
	public static int buscar(int[] array, int objetivo) {
		for(int i=0; i< array.length; i++) {
			if(array[i] == objetivo) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	
	public static void main(String[] arg) {
		/*Busque un valor específico en un array de ints (no ordenado) y devuelva su posición, o-1
si el valor no existe.*/
		Scanner sc = new Scanner(System.in);
		
		int[] lista = {4,3,34,6,2,89,56,32};
		
		System.out.println("Introduce un número entero:");
		int objetivo=sc.nextInt();
		
		int posicion = buscar(lista, objetivo);
		if(posicion > -1) {
		System.out.println("El número está en la posición: " + (posicion+1));
		}else {
			System.out.println("El número no está en ninguna posición");
		}
		sc.close();
		
	}
}

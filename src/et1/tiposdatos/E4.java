package et1.tiposdatos;
import java.util.Scanner;

/*Calcule el mínimo y el máximo de una serie de números enteros positivos introducidos por
el usuario. Cuando el usuario introduzca un número negativo se considerará que el anterior
a este es el último número.*/
public class E4 {
		public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero:");
		int numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("No se ha introducido un número válido");
		}else {
			int max = numero;
			int min = numero;
		
		
			while(numero >= 0) {
			
					if(numero > max ) {
						max=numero;
					}
					if(numero < min) {
						min=numero;
					}	
					System.out.println("Introduce otro número entero (negativo para acabar):");
		
					numero = sc.nextInt();
			}
			System.out.println("El mayor número introducido: " + max);
			System.out.println("El menor número introducido: " + min);
		}
		
		sc.close();
		
		}
}

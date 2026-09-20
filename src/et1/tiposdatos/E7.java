package et1.tiposdatos;

import java.util.Scanner;

/*Tome un número entero escrito por el usuario y lo descomponga en factores primos. Por
ejemplo: 40 = 2×2×2×5.*/
public class E7 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número a descomponer en factores primos:");
		
		int numero = sc.nextInt();
	
		int contador = 0;
		int[] factores = new int[32];
		int inicial=numero;
		
		if(numero<=2) {
			System.out.println("El número no se puede factorizar más: " + numero);
		
		}else {
			
			for(int i=2; i<=numero; i++) {
				while(numero % i == 0) {
					factores[contador] = i;
					contador++;
					numero=numero/i;
				}
						
			}
			
			System.out.print("El número " + inicial + ": " + factores[0]);
			
			for(int j=1; j < contador; j++) {
				System.out.print("x" + factores[j]);
			}
			sc.close();
			
			}
			
		
		
		
	}
}

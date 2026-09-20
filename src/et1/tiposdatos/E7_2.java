package et1.tiposdatos;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class E7_2 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número a descomponer en factores primos:");
		
		int numero = sc.nextInt();
		int inicial = numero;
		
		List<Integer> factores = new ArrayList<Integer>();
		
		if(numero<=1) {
			System.out.println("El número no se puede factorizar más: " + numero);
		
		}else {
			
			for(int i=2; i<=numero; i++) {
				while(numero % i == 0) {
					factores.add(i);
					numero=numero/i;
				}
						
			}
			
			System.out.print("El número " + inicial + ": " + factores.get(0));
			
			for(int j=1; j < factores.size(); j++) {
				System.out.print("x" + factores.get(j));
			}
			sc.close();
			
			}
		
		
		
		
	
		
		
	}
}

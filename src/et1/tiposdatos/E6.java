package et1.tiposdatos;

public class E6 {
	public static void main(String[] arg) {
		//Muestre por pantalla la lista de los 100 primeros números primos.
		
		int primosEncontrados=0;
		int numero = 2;
		
		while(primosEncontrados<100) {
			boolean Primo = true;
			
			for(int i=2; i< numero; i++) {
				if(numero % i ==0) {
					Primo = false;
					break;
				}
			}
			if(Primo == true) {
				primosEncontrados++;
				System.out.println("Nº" + primosEncontrados + ": " + numero + " es primo");
			}
			numero++;
			
		}
			
		
	}
}

package et1.tiposdatos;

public class E3 {
	public static void main(String[] arg) {
		int suma=0;
		int contador=0;
		for(int i=1;i<101;i++) {
			if(i%5==0) {
				suma=suma+i;
				contador++;
			System.out.println( + i);
		}
	}
		System.out.println("La suma total es:"+ suma);
		System.out.println("El número de múltiplos es:"+ contador);
		
	//OTRA FORMA MÁS EFICIENTE
	/*	for(i=5;5<=100;i+=5) {
			suma+=i;
			contador++;
			System.out.println(i); */
		}
	}
	

package et1.arrays;

/* Genere un array de 300 enteros en el que cada posición contenga su índice módulo 16. Es
decir, que siga la siguiente secuencia:*/
public class E3 {
	public static void main(String[] arg) {
	
		int[] serie = new int[300];
		
		for(int j=0; j<300; j++) {
			serie[j]=j%16;
		}
		
		
		for(int k=0; k<serie.length; k++) {
			System.out.println(serie[k]);
		}
	}
}

package et1.arrays;

public class E7 {
	public static int[] multiplicador(int[] array, int factor) {
		int[] listaMultiplicada = new int[array.length];
		
		for(int i=0; i < array.length; i++) {
			listaMultiplicada[i]= factor*array[i];
			
		}
		return  listaMultiplicada;
	}
	
	public static void main(String[] arg) {
		
		int[] lista = {4, 5, 9, 14, 23, 5, 1, 66};
		int[] listaMultiplicad = multiplicador(lista, 3);
		for(int j=0; j< lista.length; j++) {
			System.out.println(listaMultiplicad[j]);
		}
	}
}

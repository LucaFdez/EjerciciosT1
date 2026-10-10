package et1.arrays;

public class E5 {
	public static float promedio(float[] array) {
		float suma=0;
		int longitud=array.length;
		for(int i=0; i < array.length; i++) {
			suma+= array[i];
		}
		return suma / longitud;
		//mejor return suma / array.length;
		
		
	}
	
	public static void main(String[] arg) {
		float[] lista = {4.5f, 5.6f, 8.45f, 98.03f, 32.3f};
		System.out.println("El promedio es: " + promedio(lista));
		
	}
}

package et1.arrays;


/*Cuente el número de valores negativos que hay en un array de floats.*/
public class E8 {
	public static int contarNeg(float[] datos) {
		int numeros=0;
		if(datos == null) {
			return 0;
		}
		for(int i=0; i < datos.length; i++) {
			if(datos[i]< 0) {
				numeros++;
			}
			
		}
		
		return numeros;
	}
	
	public static void main(String[] arg){
	
		float[] arr = {-1f,5.43f,-7.23f,8f,9.4f,-10.4f};
		int resultado = contarNeg(arr);
		System.out.println("Hay " + resultado + " números negativos en el array");
	}
}

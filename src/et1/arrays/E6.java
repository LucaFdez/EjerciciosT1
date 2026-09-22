package et1.arrays;
import java.util.Scanner;


/*Reciba una matriz (array bidimensional de floats, siguiendo el orden de primero fila y
luego columna), y devuelva un array que contenga el valor máximo de cada fila.*/
public class E6 {
	
	public static float[] calcularMax(float [][] matriz) {
		float[] maxFila= new float[matriz.length];
		
		for(int i=0; i < matriz.length; i++) {
			maxFila[i]= matriz[i][0];
			for(int j=1; j < matriz[i].length; j++) {
				if(matriz[i][j] > maxFila[i]) {
					maxFila[i]=matriz[i][j];
				}
			}
		}
		
		
		return maxFila;
	}
	
	public static void main(String[] arg) {
		float[][] datos= {
		{0.3f,1.1f,5.6f},
		{6f,78.6f,4.9f},
		{34f,5.8f,5.43f}
		};
		float[] resultado = calcularMax(datos);
		
		System.out.print("Los valores máximos son: {");
		for(int i=0; i < resultado.length; i++) {
			System.out.print(resultado[i] + ", ");
		}
		System.out.print("}");
	}
	
}

package et1.ConjuntosYListas;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
/**/

public class E1 {
	
	public static class Measurement{
		private float[] canales;
		
		public Measurement(float[] canales) {
			this.canales=canales;
		}
		
		public float[] getCanales() {
			return this.canales;
		}
		
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		Set<Measurement> conjunto = new HashSet<>();
		
		for(int i=0; i<10;i++) {
			System.out.println("Introduce los 4 valores de canales para la muestra " + (i + 1) + ":");
			float[] datos = new float[4];
			for(int j=0; j<4; j++) {
				datos[j]= sc.nextFloat();
			}
			Measurement m = new Measurement(datos);
			
			conjunto.add(m);
		}
		   
		System.out.println("¡Se han añadido las 10 medidas correctamente al conjunto!");
        sc.close();
	}
}

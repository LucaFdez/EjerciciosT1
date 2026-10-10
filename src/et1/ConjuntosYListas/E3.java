package et1.ConjuntosYListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E3 {
	public static class Measurements{
		private List<Float> canales;
		
		public Measurements(List<Float> canales) {
			this.canales=canales;
		}
		
		public List<Float> getCanales(){
			return this.canales;
					
		}
		
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		List<Float> datosCanales = new ArrayList<>();
		
		System.out.println("¿Cuántos canales deseas introducir para esta medida?");
        int totalCanales = sc.nextInt();
        
        // 2. Rellenamos la lista dinámicamente con los datos del usuario
        for (int i = 0; i < totalCanales; i++) {
            System.out.println("Introduce el valor del canal " + (i + 1) + ":");
            float valor = sc.nextFloat();
            
            // Añadimos el número a la lista usando .add() (recuerda que usa la clase envoltorio Float)
           datosCanales.add(valor);
        }
        
        // 3. Instanciamos el objeto Measurement pasándole la lista dinámica[cite: 4]
        Measurements m = new Measurements(datosCanales);
        
        // 4. Comprobamos el resultado imprimiendo los canales y su tamaño con .size()
        System.out.println("¡Muestra creada con éxito!");
        System.out.println("Número de canales guardados: " + m.getCanales().size());
        System.out.println("Valores de los canales: " + m.getCanales());
        
        sc.close();
		
	}
}

package et1.tiposdatos;

public class E5 {
		public static void main(String[] arg) {
			
			// Bucle exterior: itera por cada tabla del 1 al 10
	        for (int tabla = 1; tabla <= 10; tabla++) {
	            System.out.println("Tabla del " + tabla);
	            
	            // Bucle interior: multiplica la tabla actual por los números del 0 al 10
	            for (int i = 0; i <= 10; i++) {
	                System.out.println(tabla + " x " + i + " = " + (tabla * i));
	            }
	        }
		}
}

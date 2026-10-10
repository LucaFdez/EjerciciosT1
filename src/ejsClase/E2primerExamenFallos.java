package ejsClase;

public class E2primerExamenFallos {

	public static void main(String[] arg) {
		int acumulado = 0; //no puede ser un int
		
		float[] arr = {2.5f, 3.5f};
		
		for(int i=0; 1 < arr.length; i++) {
			acumulado+= arr[i]; //se convierte el float a integer
		}
		
		System.out.println(acumulado/arr.length);
		
	}
	
}

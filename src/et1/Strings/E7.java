package et1.Strings;


/*Verifique que un String contiene un número con decimales válido. Se aceptarán tanto
puntos (“.”) como comas (“,”) como separador decimal.*/
public class E7 {
	public static boolean esDecimalValido(String texto) {
		String s = texto.trim();
		
		int contadorSeparadores  = 0;
		int digitosAntes = 0;
		int digitosDespues = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(Character.isDigit(c)) {
				if(contadorSeparadores==0) {
					digitosAntes++;
				}else {
					digitosDespues++;
				}
			}else if(c == '.' || c == ',') {
				contadorSeparadores++;
				if(contadorSeparadores > 1) {
					return false;
				}
			}else {
				return false;
			}
		}
		
		return contadorSeparadores == 1 && digitosAntes > 0 && digitosDespues > 0;
	}
	public static void main(String[] arg) {
		System.out.println("Verificación de número decimal válido:");
		System.out.println("14,5 --->" + esDecimalValido("14,5"));
		System.out.println("14.5 --->" + esDecimalValido("14.5"));
		System.out.println("A --->" + esDecimalValido("A"));
		System.out.println("19,0.9 --->" + esDecimalValido("19,0.9"));
		
		
	}
}

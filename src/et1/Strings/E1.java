package et1.Strings;

public class E1 {
	public static void main(String[] arg) {
		
		String texto = " s, 14, 25.4, 89.0, s";
        String primerNumero = "";
        boolean leyendoNumero = false;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Comprobamos si el carácter actual es parte de un número (dígito o punto decimal)
            if (Character.isDigit(c) || (leyendoNumero && c == '.')) {
                primerNumero += c;     // Acumulamos el carácter al número
                leyendoNumero = true;  // Marcamos que ya hemos empezado a leer el número
            } else if (leyendoNumero) {
                // Si ya estábamos leyendo y encontramos un carácter no numérico (coma, espacio...), terminamos
                break;
            }
        }

        if (!primerNumero.isEmpty()) {
            System.out.println("El primer número que aparece es: " + primerNumero);
        } else {
            System.out.println("No se encontró ningún número en la cadena.");
        }
	}
}

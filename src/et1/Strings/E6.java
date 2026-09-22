package et1.Strings;


public class E6 {
	public static String intercambiarPuntosYComas(String original) {
		String resultado = original.replace(".","#").replace(",", ".").replace("#",",");
		return resultado;
	}
	public static void main(String[] arg) {
		String lista = "s, 3, 4, 67.0, socio, aa, coma";
		
		String resultado = intercambiarPuntosYComas(lista);
		System.out.println(resultado);
		
	}
}

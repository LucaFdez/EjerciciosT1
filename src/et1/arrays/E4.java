package et1.arrays;

public class E4 {
	
	public static void main(String[] arg) {
		char[] lista = new char[300];
		char[] codHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		for(int i=0; i<lista.length; i++) {
			lista[i]= codHex[i % 16]; 
		}
		
		for(int j=0; j<lista.length; j++) {
			System.out.println(lista[j]);
		}
	}
}

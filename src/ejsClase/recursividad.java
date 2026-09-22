package ejsClase;

public class recursividad {

	public static int suma(int n) {
		//caso base
		if(n==1) {
			return 1;
		}
		//paso recursivo
		else {
			return n+suma(n-1);
		}
		
	
	}
	
	public static void main(String[] arg) {
		System.out.println(suma(5));
	}
}



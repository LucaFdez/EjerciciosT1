package ejsClase;

import java.util.Arrays;

public class Alumno implements Comparable<Alumno> {
	String nombre;
	double nota;
	
	public Alumno(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
	
	public static Alumno[] ordenar(Alumno[] arr) { //n^2
		for(int pasada=0; pasada < arr.length; pasada++) {
			boolean changed = false;
			for (int i = 0; i < arr.length - 1 - pasada ; i++) { //Si ya ha ordenado 3º, que el segundo for empiece por el 4º
				if(arr[i].compareTo(arr[i+1])) { //arr[i] es un alumno
					Alumno tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					changed = true;
				}
			}
			if (changed == false) {
				System.out.println("Pasada nº: " + (pasada +1));
				break;
			}
			System.out.println("Pasada nº: " + (pasada +1));
			
		}
		return arr;
	}
	
	@Override
	public int compareTo(Alumno o) {
		//return this.nombre.compareTo(o.nombre);
		return Double.compare(this.nota, o.nota);
	}
	public static void main(String[] arg) {
		String a = "Ana";
		String c = "Carlos";
		
		//System.out.println(a.compareTo(c)); //si a<c (negativo), a=c (0), a>c (positivo)
		
		//System.out.println(Double.compare(11.0, 11.0));
		
		Alumno ana = new Alumno("Ana", 9.0);
		Alumno carlos = new Alumno("Carlos", 8.75);
		Alumno alejandra = new Alumno("Alejandra", 7.5);
		
		Alumno[] alumnos = {carlos, ana, alejandra};
		
		
		System.out.println(Arrays.toString(ordenar(alumnos)));
	}
	
}

package ejsClase;

import java.util.Arrays;

public class BubbleSort {
	
	public static int[] ordenar(int[] arr) { //n^2
		for(int pasada=0; pasada < arr.length; pasada++) {
			boolean changed = false;
			for (int i = 0; i < arr.length - 1 - pasada ; i++) { //Si ya ha ordenado 3º, que el segundo for empiece por el 4º
				if(arr[i] > arr[i+1]) {
					int tmp = arr[i];
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
	
	
	public static void main(String[] arg) {
		
		System.out.println(Arrays.toString(ordenar(new int[] {6, 2, 4, 9, -10})));
		System.out.println(Arrays.toString(ordenar(new int[] {2, 4, 6, 9, -10})));
	}
}

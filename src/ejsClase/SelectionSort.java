package ejsClase;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] ordenar(int[] arr) {
		
		for(int pos=0; pos < arr.length; pos++) {  //(n)-->n*(n+1)/2=n^2
			int posMin=pos;
			int valorMin = arr[pos];
			
			for(int i = pos+1; i < arr.length; i++) { //(n+(n-1)+(n-2)+...+ 3+2+1)=(n+1)/2
				if(arr[i] < arr[posMin]) { //puede ser arr[i]<valorMin
					posMin=i;
				}
			}
			int tmp = arr[pos];
			arr[pos]= arr[posMin];
			arr[posMin]= tmp;
			
		}
		
		return arr;
	}
	
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(ordenar(new int[] {6, 2, 4, 9, -10})));
	}
}

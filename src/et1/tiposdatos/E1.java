package et1.tiposdatos;


/*1. Defina variables que representen el número de días de un año, el número de horas que
tiene un día, el número de minutos que tiene una hora y el número de segundos que tiene
un minuto. Emplee las variables que ocupen el mínimo espacio de memoria posible. A
continuación, calcule el número de segundos que tiene un año y almacene el valor de dicho
cálculo en otra variable.*/

public class E1 {
	public static void main(String[] args) {
	short diasAnio = 365;
	byte horasDia = 24;
	byte minHoras = 60;
	byte segMin = 60;
	int segAnio = diasAnio * horasDia * minHoras * segMin;
	System.out.println("segundos en un anio: " + segAnio);
}
}
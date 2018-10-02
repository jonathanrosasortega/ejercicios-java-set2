/*Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.*/
public class ej1 {
	public static void main(String[] args) {
		int x = 144;
		int y = 999;
		System.out.println("X vale " + x + ", mientras que Y vale " + y);
		System.out.println("X más Y suman " + (x+y));
		System.out.println("X menos Y son " + (x-y));
		System.out.println("X multiplicado por Y son " + (x*y));
		System.out.println("X dividido entre Y son " + ((float)x/(float)y));
	}
}

/*Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.*/
public class ej5 {
	public static void main(String[] args) {
		double euros = 166.386;
		double pesetas = 1000;
		System.out.printf("%.0f pesetas son %.2f euros\n", pesetas, pesetas/euros);
	}
}

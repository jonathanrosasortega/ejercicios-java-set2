/*Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.*/
public class ej6 {
	public static void main(String[] args) {
		double base = 850.75;
    
    System.out.printf("Base imponible: %.2f\n", base);
    System.out.printf("IVA : %.2f\n", (base*0.21));
    System.out.printf("Total: %.2f\n", (base*1.21));
	}
}

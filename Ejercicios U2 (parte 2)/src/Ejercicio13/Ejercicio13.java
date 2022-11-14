package Ejercicio13;
import java.util.Scanner;
/*Crea una aplicación que dibuje una escalera de números, siendo cada línea números
empezando en uno y acabando en el numero de la línea.*/

public class Ejercicio13 {

	public static void main(String[] args) {
		String cadena = "";
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduzca la altura: ");
		int altura = leer.nextInt();
		leer.close();
		
		for(int i=1;i<=altura;i++) {
			cadena = cadena+i;
			System.out.println(cadena);
		}

	}

}

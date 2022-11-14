package Ejercicio05;

/*Programa que muestre en líneas separadas lo siguiente:
ZYWXVUTSRQPONMLKJIHGFEDCBA, YWXVUTSRQPONMLKJIHGFEDCBA,
WXVUTSRQPONMLKJIHGFEDCBA, ...., DCBA, CBA, BA, A.*/

public class Ejercicio05 {

	public static void main(String[] args) {
		String cadena = "ZYWXVUTSRQPONMLKJIHGFEDCBA";
		System.out.println(cadena);
		System.out.println("Tamaño de la variable cadena: "+cadena.length());
		
		for(int i=0;i<cadena.length();i++) {
			System.out.println(cadena.substring(i, cadena.length()));
		}
	}

}

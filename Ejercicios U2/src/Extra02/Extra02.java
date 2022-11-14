package Extra02;

import java.util.Scanner;

/*Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.*/

public class Extra02 {

	public static void main(String[] args) {
		char caracter = '?';
		Scanner leer = new Scanner(System.in);
		while (caracter!=' ') {
			System.out.print("Introduzca una letra (pulse espacio para finalizar el programa): ");
			caracter = leer.nextLine().charAt(0); //lee el primer caracter introducido de la cadena de caracteres.
			if (caracter=='a' || caracter=='A' || caracter=='e'|| caracter=='E' || caracter=='i' || caracter=='I' || caracter=='o' || caracter=='O' || caracter=='u' || caracter=='U') {
				System.out.println("VOCAL");
			}else if (caracter!=' '){
				System.out.println("NO VOCAL");
			}else {
				System.out.println("FIN DEL PROGRAMA.");
			}
			
		}
		leer.close();
		
}
	}

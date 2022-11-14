package Ejercicio16;

import java.util.Scanner;

/*Un programa que lee una secuencia de notas (con valores que
van de 0 a 10) que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.*/

public class Ejercicio16 {

	public static void main(String[] args) {

		int nota=0;
		int diez=0;
		Scanner leer = new Scanner(System.in);
		
		while(nota!=-1) {
			System.out.print("Introduzca una secuencia de notas hasta que introduzca el valor -1: ");
			nota = leer.nextInt();
			if(nota==10){
				diez = diez+1;
			}
			else if((nota<0)||(nota>10))
			{
				System.out.println("Nota no valida.");
			}
		}
		System.out.println("Ha introducido "+diez+" notas de valor '10'.");
	    leer.close();
	}

}

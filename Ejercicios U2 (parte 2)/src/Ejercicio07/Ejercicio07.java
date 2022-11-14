package Ejercicio07;

import java.util.Scanner;

/*Haz un programa que lea 100 números no nulos y luego muestre un
mensaje de si ha leído algún número negativo o no.*/
public class Ejercicio07 {

	public static void main(String[] args) {
		int num, neg=0;
		Scanner leer = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.print("Introduzca un número no nulo: ");
			num = leer.nextInt();
			while(num==0) {
				System.out.print("Introduzca un número no nulo: ");
				num = leer.nextInt();
			}
			if(num<0) {
				neg++;
			}
		}
		System.out.println("Se han leído "+neg+" números negativos");
		leer.close();
		}
	}


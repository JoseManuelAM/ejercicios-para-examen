package Ejercicio24;

import java.util.Scanner;

/*Tiendas Don Pepe desea un programa para ingresar por teclado el monto de compra y el día
de la semana; si el día es martes o jueves, se realizará un descuento del 15% por la compra.
Visualizar el descuento y el total a pagar por la compra.*/

public class Ejercicio24 {

	public static void main(String[] args) {
		
		int opcion=1;
		double montoTotal=0;
		double montoDia=0;
		
		Scanner leer;
		
		while(opcion!=0)
		{
			System.out.println("**************************");
			System.out.println("      TIENDAS DON PEPE    ");
			System.out.println("Selecciona el día que quieres ingresar el monto de compra");
			System.out.println("1.-Lunes");
			System.out.println("2.-Martes");
			System.out.println("3.-Miércoles");
			System.out.println("4.-Jueves");
			System.out.println("5.-Viernes");
			System.out.println("6.-Sabado");
			System.out.println("7.-Domingo");
			System.out.println("0.-SALIR");
			System.out.println("Insertar día:");
			leer=new Scanner(System.in);
			opcion=leer.nextInt();
			
			
			switch(opcion)
			{
				case 0:
					System.out.println("Adiós");
					break;
				case 2:
				case 4:
					System.out.println("**************************");
					System.out.println("Insertar monto del día:");
					leer=new Scanner(System.in);
					montoDia=leer.nextInt();
					System.out.println("Con el descuento:"+(montoDia-(montoDia*0.15)));
					montoTotal=montoTotal+(montoDia-(montoDia*0.15));
					break;
				default:
					System.out.println("**************************");
					System.out.println("Insertar monto del día:");
					leer=new Scanner(System.in);
					montoDia=leer.nextInt();
					montoTotal=montoTotal+montoDia;
			}
			
		}
		System.out.println("**************************");
		System.out.println("      TIENDAS DON PEPE    ");
		System.out.println("Las ganancias son:");
		System.out.println(montoTotal);

	}

}


package Ejercicio19;

/*Escriba un programa que simule un cajero automático con un saldo inicial de 1000 dólares,
con el siguiente menú de opciones: SWITCH*/
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) 
	{
		int saldo = 1000, operacion, dinero;
		Scanner leer = new Scanner(System.in);
		
		do
		{
		System.out.println("\nMenú:");
		System.out.println("1. Ingresar dinero");
		System.out.println("2. Retirar dinero");
		System.out.println("3. Consultar saldo actual");
		System.out.println("0. Salir");
		System.out.print("¿Qué desea? ");
		operacion = leer.nextInt();
		
			switch(operacion)
			{
			case 1:
				System.out.print("Introduzca la cantidad a depositar: ");
				dinero = leer.nextInt();
				saldo = saldo+dinero;
				break;
			case 2:
				System.out.print("Introduzca la cantidad a retirar: ");
				dinero = leer.nextInt();
				while(dinero>saldo)
				{
					System.out.print("No tiene suficiente saldo para retirar esa cantidad. Introduzca la cantidad a retirar: ");
					dinero = leer.nextInt();
				}
				saldo = saldo-dinero;
				break;
			case 3:
				System.out.println("Su saldo actual es de "+saldo +" euros.");
				break;
			default:
				System.out.println("Ese número del menú no es válido.");	
			}
		}while(operacion!=0);
		
		
		leer.close();
	}

}

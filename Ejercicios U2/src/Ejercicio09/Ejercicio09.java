package Ejercicio09;

/*Escriba programa que pida la edad por teclado y nos muestra el
mensaje de “Eres mayor de edad” o el mensaje de “Eres menor de edad”.*/
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) 
	{
		int edad;
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduzca su edad: ");
		edad = leer.nextInt();
		leer.nextLine();
		if(edad>=18)
		{
			System.out.println("Eres mayor de edad.");
		}else {
			System.out.println("Eres menor de edad.");
		}
		
		leer.close();
	}

}

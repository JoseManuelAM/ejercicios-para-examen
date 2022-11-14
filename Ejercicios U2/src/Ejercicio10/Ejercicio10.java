package Ejercicio10;

/*Escriba un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
producto y división (Ten en cuenta la división por cero).*/
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) 
	{
		int num1, num2, suma, resta, mult, div;
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduzca el primer número: ");
		num1 = leer.nextInt();
		System.out.print("Introduzca el segundo número: ");
		num2 = leer.nextInt();
		
		suma = num1+num2;
		resta = num1-num2;
		mult = num1*num2;
		if (num2==0)
		{
			div=0;
			System.out.println("No se puede realizar la división entre 0.");
		}else {
		div = num1/num2;
		}
		System.out.println("\nLa suma de ambos números es "+suma);
		System.out.println("La resta de ambos números es " +resta);
		System.out.println("La multiplicación de ambos números es " +mult);
		System.out.println("La división de ambos números es " +div);
		leer.close();
		}
	}

package Ejercicio20;

/*Escriba un programa que lea una calificación numérica entre 0 y 10 y la transforme en la
calificación alfabética, escribiendo el siguiente resultado (switch).
• De 0 a < 3 Muy Deficiente.
• De 3 a < 5 Insuficiente.
• De 5 a < 6 Suficiente.
• De 6 a < 7 Bien.
• De 7 a <9 Notable.
• De 9 a 10 Sobresaliente.*/
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) 
	{
		int nota;
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduzca una calificación entre 0 y 10: ");
		nota = leer.nextInt();
		
		while (nota<0 || nota>10)
		{
			System.out.print("No es válido. Introduzca una calificación comprendida entre 0 y 10: ");
			nota = leer.nextInt();
	    }
		leer.close();
		
		switch (nota)
		{
		case 0:
		case 1:
		case 2:
			System.out.println("Muy Deficiente.");
			break;		
		case 3:
		case 4:
			System.out.println("Insuficiente.");
			break;
		case 5:
			System.out.println("Suficiente.");
			break;
		case 6:
			System.out.println("Bien.");
			break;
		case 7:
		case 8:
			System.out.println("Notable.");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente.");
			break;
        }
	}

}
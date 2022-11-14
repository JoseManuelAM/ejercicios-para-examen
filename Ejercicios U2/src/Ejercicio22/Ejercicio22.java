package Ejercicio22;
import java.util.Scanner;
/*Escriba un programa que recibe como datos de entrada una hora expresada en horas,
minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán,
transcurrido un segundo.*/

public class Ejercicio22 {

	public static void main(String[] args) {
		int hora, min, seg;
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduzca una hora expresada en horas, minutos y segundos. Indique la hora: ");
		hora = leer.nextInt();
		while (hora>23 || hora<0)
		{
			System.out.print("Introduzca una hora válida: ");
			hora = leer.nextInt();
		}
		System.out.print("Indique el minuto: ");
		min = leer.nextInt();
		while (min>59 || min<0)
		{
			System.out.print("Introduzca un minuto válido: ");
			min = leer.nextInt();
		}
		System.out.print("Indique el segundo: ");
		seg = leer.nextInt();
		while (seg>59 || seg<0)
		{
			System.out.print("Introduzca un segundo válido: ");
			seg = leer.nextInt();
		}
		leer.close();
		
		
		if (seg!=59)
		{
			seg++;
		}else {
			seg = 0;
			if (min!=59)
			{
			min++;
			}else {
				min=0;
				hora = hora+1;
			}
			
		}
		
			System.out.println("La hora tras un segundo sería "+hora +("h, ")+min +("min y ")+seg +("seg"));
	

	}
	
}
	


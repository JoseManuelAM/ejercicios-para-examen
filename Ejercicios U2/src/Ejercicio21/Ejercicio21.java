package Ejercicio21;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Escriba un programa que calcula el salario neto semanal de un trabajador en función del
número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
• Las primeras 35 horas se pagan a tarifa normal.
• Las horas que pasen de las 35 horas se pagan a 1,5 veces la tarifa normal.
• Las tasas de impuesto son:
o Los primeros 500€ son libres de impuestos.
o Los siguientes 400€ tiene un 25% de impuesto.
o Los restantes un 45% de impuesto.

Escribe el nombre del trabajador, salario bruto, tasas y salario neto.*/

public class Ejercicio21 {

	public static void main(String[] args)  throws IOException{
		int horas, pago;
		double S_bruto, S_neto, aux, aux2, aux3, impuesto, imp1, imp2;
		Scanner leer = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduzca el nombre del trabajador: ");
		String nombre = reader.readLine();
		System.out.print("Introduzca el número de horas trabajadas: ");
		horas = leer.nextInt();
		System.out.print("Introduzca el pago por hora:");
		pago = leer.nextInt();
		leer.close();
		
		if (horas<35)
		{
			S_bruto = horas*pago;
		}else {
			aux = 35*pago;
			aux2 = horas-35;
			aux3 = aux2*(pago*1.5);
			S_bruto = aux+aux3;
		}
		
		if (S_bruto<=500) 
		{
			S_neto = S_bruto;
		}else {
			aux = S_bruto-500;
			if (aux<400) 
			{
				impuesto = aux*0.25;
				S_neto = S_bruto-impuesto;
			}else {
				imp1 = 400*0.25;
				imp2 = S_bruto-900;
				imp2 = imp2*0.45;
				impuesto = imp1+imp2;
				S_neto = S_bruto-impuesto;
			}	
		}
		System.out.println(nombre +" tiene un salario neto de "+S_neto +"€");
		
				
	}

}

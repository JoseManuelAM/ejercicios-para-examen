package Ejercicio23;

import java.util.Scanner;

/*Una farmacia desea un programa para ingresar el valor de compra y calcular lo siguiente: si
el pago se efectúa al “contado”, calcular un descuento del 5%; pero si el pago es con “tarjeta”
se incrementa un recargo del 3% al valor de compra. Calcular y visualizar el descuento o recargo
según sea el caso y el total a pagar de la compra.*/

public class Ejercicio23 {

	public static void main(String[] args) {
		double descuento, recargo;
		Scanner leer = new Scanner (System.in);
		System.out.print("Introduzca el valor de su compra: ");
		double compra = leer.nextDouble();
		System.out.println("Introduzca su método de pago: ");
		System.out.println("1.-al contado");
		System.out.println("2.-tarjeta");
		int metodo = leer.nextInt();
		leer.close();
		
		switch(metodo)
		{
		case 1:
			descuento = compra*0.05;
			compra = compra-descuento;
			System.out.println("Ha recibido un descuento de "+(String.format("%.2f", descuento))+"€");
			System.out.println("Su total a pagar es de "+(String.format("%.2f", compra))+"€");
			break;
			
		case 2:
			recargo = compra*0.03;
			compra = compra+recargo;
			System.out.println("Se le ha aplicado un recargo de "+(String.format("%.2f", recargo))+"€");
			System.out.println("Su total a pagar es de "+(String.format("%.2f", compra))+"€");
			break;
			
		default: System.out.println("ERROR");	
		}

	}

}

package Extra03;

import java.util.Scanner;

/*Escribe un programa que pida el limite inferior y superior de un intervalo.  Si el límite inferior es mayor que el superior lo tiene que volver a pedir.  A continuación se van introduciendo números hasta que introduzcamos el 0. 
Cuando termine el programa dará las siguientes informaciones
– La suma de los números que están dentro del intervalo (intervalo abierto).
– Cuantos números están fuera del intervalo.
– Informa si hemos introducido algún número igual a los límites del intervalo.*/

public class Extra03 {

	public static void main(String[] args) {
		int lsup, linf, num=1, suma=0, fuera=0;
		boolean igual_lim=false;
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduzca el límite inferior del intervalo: ");
		linf=leer.nextInt();
		System.out.print("Introduzca el límite superior del intervalo: ");
		lsup=leer.nextInt();
		
		if(linf>lsup) {
			System.out.println("El límite superior debe ser mayor que el inferior.");
			System.out.print("Introduzca el límite inferior del intervalo: ");
			linf=leer.nextInt();
		}
		while(num!=0) {
			System.out.println("Introduzca números (pulse 0 para terminar la cadena de números): ");
			num=leer.nextInt();
		leer.close();
			if(num>linf && num<lsup) {
				suma = suma+num;
			}else if(num<linf || num>lsup) {
				fuera++;
			}else if(num==linf || num==lsup){
				igual_lim=true;
			}
		}
		System.out.println("La suma de los números que están dentro del intervalo es "+suma);
		System.out.println("Hay "+fuera +" números fuera del intervalo.");
		if(igual_lim=true) {
			System.out.println("Alguno de los números introducidos es igual a los límites.");
		}
	}

}

package Extra04;

import java.util.Scanner;

/*Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €,el segundo 20 €, el tercero 40 € y así sucesivamente.
Realizar un programa para determinar cuánto debe pagar mensualmente y el total de lo que pagará después de los 20 meses.
Este programa puede servir para calcular otras compras y con diferentes plazos.*/

public class Extra04 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String aste="*";
		String esp="";
		System.out.print("Introduzca la altura de la pirámide invertida: ");
		int altura = leer.nextInt();
		leer.close();
		
		for(int i=0;i<altura;i++) 
		{
			for(int j=i;j<(altura-1);j++)
			{
				aste = aste+"**";
			}
			System.out.println(esp+aste);
			esp = esp+" ";
			aste = "*";
		}
		
	}

}

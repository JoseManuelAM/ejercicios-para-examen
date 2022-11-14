package Ejercicio15;
import java.util.Scanner;
/*Crea una aplicación que dibuje una pirámide invertida de asteriscos. Nosotros le
pasamos la altura de la pirámide por teclado.*/

public class Ejercico15 {

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






    
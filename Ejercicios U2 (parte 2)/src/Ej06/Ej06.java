package Ej06;

import java.util.Scanner;

public class Ej06 {
	
	/*
	 * Dibuja un ordinograma de un programa que lea un número positivo N y calcule y visualice
su factorial N! Siendo el factorial:
0! = 1
1! = 1
2! = 2 * 1
3! = 3 * 2* 1
N! = N * (N-1) * (N-2) * ... * .
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un numero: ");
		Scanner leer=new Scanner(System.in);
		int n=leer.nextInt();
		leer.close();
		int factorial=1;
		
		System.out.println("0! =1");
		for(int i=1; i<=n;i++)
		{
			factorial=factorial*i;
			System.out.println(i+"! ="+(factorial));
		}
		
		/*  0! = 1
			1! = 1 * 1 //i*factorial
			2! = 2 * 1 //i*factorial
			3! = 3 * 2* 1 //i * factorial (2*1)
			N! = N * (N-1) * (N-2) * ... * .
	 */
		

	}

}
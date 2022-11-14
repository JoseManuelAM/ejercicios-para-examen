package Ej07;

public class Ej07 {

	/*
	 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador=1;
		
		System.out.println("Quiniela de Juan");
		System.out.println("                     Col   1|Col   2|Col   3|");
		while(contador<=15)
		{
			
			//1-->1
			//2-->x
			//3-->2
			
			System.out.print("Equipo 1 - Equipo 2 :  ");
			switch((int)(Math.random()*3) + 1)
			{
			 case 1:
				 System.out.print("1    |");
				 break;
			 case 2:
				 System.out.print("  x  |");
				 break; 
			 case 3:
				 System.out.print("    2|");
				 break;
			default:
					 break;
				 
			}
			
			System.out.print("  ");
			switch((int)(Math.random()*3) + 1)
			{
			 case 1:
				 System.out.print("1    |");
				 break;
			 case 2:
				 System.out.print("  x  |");
				 break; 
			 case 3:
				 System.out.print("    2|");
				 break;
			default:
					 break;
				 
			}
			
			System.out.print("  ");
			switch((int)(Math.random()*3) + 1)
			{
			 case 1:
				 System.out.print("1    |");
				 break;
			 case 2:
				 System.out.print("  x  |");
				 break; 
			 case 3:
				 System.out.print("    2|");
				 break;
			default:
					 break;
				 
			}
			contador=contador+1;
			System.out.println("");
		}
		
	}

}
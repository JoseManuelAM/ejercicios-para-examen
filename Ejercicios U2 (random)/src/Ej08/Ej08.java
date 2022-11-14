package Ej08;

public class Ej08 {

	/*
	 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
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
			switch((int)(Math.random()*6) + 1)
			{
			 case 1:
			 case 2:
			 case 3:
				 System.out.print("1    |");
				 break;
			 case 4:
			 case 5:
				 System.out.print("  x  |");
				 break; 
			 case 6:
				 System.out.print("    2|");
				 break;
			default:
					 break;
				 
			}
			
			System.out.print("  ");
			switch((int)(Math.random()*6) + 1)
			{
			 case 1:
			 case 2:
			 case 3:
				 System.out.print("1    |");
				 break;
			 case 4:
			 case 5:
				 System.out.print("  x  |");
				 break; 
			 case 6:
				 System.out.print("    2|");
				 break;
			default:
					 break;
				 
			}
			
			System.out.print("  ");
			switch((int)(Math.random()*6) + 1)
			{
			 case 1:
			 case 2:
			 case 3:
				 System.out.print("1    |");
				 break;
			 case 4:
			 case 5:
				 System.out.print("  x  |");
				 break; 
			 case 6:
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

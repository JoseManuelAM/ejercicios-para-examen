package Extra01;

/*Programa que muestre en líneas separadas lo siguiente (CON FOR):
ZYWXVUTSRQPONMLKJIHGFEDCBA, YWXVUTSRQPONMLKJIHGFEDCBA,
WXVUTSRQPONMLKJIHGFEDCBA, ...., DCBA, CBA, BA, A.*/
public class Extra01 {
	
	public static void main(String[] args) {
        for (char x = 'Z'; x >= 'A'; x--) {
            for (char y = x; y >= 'A'; y--) {                                                                          
                System.out.print(y);
            }
            System.out.println();
        }
    }

}






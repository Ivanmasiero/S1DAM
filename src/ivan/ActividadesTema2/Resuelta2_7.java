package ivan.ActividadesTema2;

import java.util.Scanner;

public class Resuelta2_7 {
	public static void main(String[] args) {
		// Vamos a ordenar tres numeros de mayor a menor
		
Scanner sc= new Scanner(System.in);
		
		System.out.print("introduzca tres numeros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a>b) {
			if (b>c) System.out.println(a + "," + b + "," + c);
		else if (a>c) System.out.println(a + "," + c + "," + b);
		else System.out.println(c + "," + a + "," + b);
		
		}
		else {
			if (b>c) 
			 if (a>c) System.out.println(b + "," + a + "," + c);
			else System.out.println(b + "," + c + "," + a);
			else System.out.println(c + "," + b + "," + a);
		}
		
		
		
	}
}

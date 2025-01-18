package ivan.ActividadesTema2;

import java.util.Scanner;

public class Resuelta2_9 {

	public static void main(String[] args) {
		// Escribir una aplicación que indique cuántas cifras tiene un número entero introducido por
		//teclado, que estará comprendido entre 0 y 99999.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		
		int num = sc.nextInt();
		
		if (num > 0 && num<10) System.out.println("el numero " + num + " tiene 1 cifra");
		else 
			if (num > 9 && num < 100) System.out.println("el numero " + num + " tiene 2 cifras");
			else
				if (num > 99 && num < 1000) System.out.println("el numero " + num + " tiene 3 cifras");
				else
				if (num > 999 && num < 10000) System.out.println("el numero " + num + " tiene 4 cifras");
				else 
					if (num > 9999 && num < 100000) System.out.println("el numero " + num + " tiene 5 cifras");
		
		

	}

}

package ivan.ActividadesTema2;

import java.util.Scanner;

public class Resuelta2_3 {
	public static void main(String[] args) {
		
		// Vamos a solicitar dos números y mostraremos cual es el mayor
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca dos numeros");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1>num2) System.out.println("El numero mayor es " + num1);
		else System.out.println("El numero mayor es " + num2);
	}

	
}

package ivan.ActividadesTema2;

import java.util.Scanner;

public class Resuelta2_1 {

	

	public static void main(String[] args) {
		
//Vamos hacer una aplicación para ver si un número es par o impar.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzcan un número");
		
		int num = sc.nextInt();
		
		if (num%2==0) System.out.println("El numero " + num + " es par");
		else System.out.println("El numero " + num + " es impar");
	}

}

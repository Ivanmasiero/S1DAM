package ivan.ActividadesTema2;

import java.util.Scanner;

public class Resuelta2_5 {

	public static void main(String[] args) {
		// vamos a ordenar dos numeros de forma decreciente
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca dos numeros");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1>num2) System.out.println(num1 + "," + num2);
		else System.out.println(num2 + "," + num1);

	}

}

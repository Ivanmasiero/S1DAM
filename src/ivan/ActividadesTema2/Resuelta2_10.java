package ivan.ActividadesTema2;

import java.util.Scanner;

public class Resuelta2_10 {

	public static void main(String[] args) {
		//Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4),
		//suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su nota");
		
		int nota = sc.nextInt();
		
		switch (nota) {
		case 1,2,3,4: System.out.println("Usted tiene un insuficiente");break;
		case 5: System.out.println("Usted tiene un insuficiente");break;
		case 6: System.out.println("Usted tiene un bien");break;
		case 7,8: System.out.println("Usted tiene un notable");break;
		case 9,10: System.out.println("Usted tiene un sobresaliente");break;

		
		
	}
		
	}

}

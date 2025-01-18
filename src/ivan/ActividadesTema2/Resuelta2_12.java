package ivan.ActividadesTema2;

import java.util.Scanner;

public class Resuelta2_12 {

	public static void main(String[] args) {
		// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que tener en
		//cuenta que existen meses con 28, 30 y 31 días (no se considerará los años bisiestos).
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca dia, mes y año. Sepárelo con espacios");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int año = sc.nextInt();
		
		if (dia < 1 || dia > 31) { System.out.println("El dia introducido es incorrecto, por lo tanto, "
				+ "fecha incorrecta");
		}else {
		if  ((dia>28 && mes ==2) || (dia>30 && mes==4) || (dia>30 && mes==6) || (dia>30 && mes==9) ||
				(dia>30 && mes==11)) { System.out.println("Día introducido incorrecto para ese "
						+ "mes en concreto, por lo tanto, fecha incorrecta");
			
		}else {
			if (año == 0) { System.out.println("Año introducido incorrecto, por lo tanto,"
					+ " fecha incorrecta");
				
			}else { System.out.println("La fecha es válida");
			
			
			
		}
		

	}

}
}
}

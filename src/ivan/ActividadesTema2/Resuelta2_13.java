package ivan.ActividadesTema2;
import java.util.Scanner;
public class Resuelta2_13 {

	public static void main(String[] args) {
		// Escribir un programa que pida una hora de la siguiente forma: hora, minutos y segundos.
		//El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
		//	hora actual [10:41:59] → hora actual +1 segundo: [10:42:00]
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca la hora, de 0 a 23");
		int hora = sc.nextInt();
		if (hora > 23 || hora < 0) {
			System.out.println("hora incorrecta");
			
		}else { System.out.println("Introduzca la minuto de 0 a 59");
		int min = sc.nextInt();
		if (min >59 || min < 0) {System.out.println("Minuto incorrecto");
		}else {System.out.println("Introduzca el segundo de 0 a 59");
		int seg = sc.nextInt();
		if (min >59 || min < 0) {System.out.println("segundo incorrecto");
		}else {
		System.out.println("Hora actual -> " + hora + ":" + min + ":" + seg);
		seg++;
		if (seg>59) {
			min++;
			seg=00;
			
		}
		if (min>59) {
			hora++;
			min=0;
		}
		if (hora > 23) {
			hora = 0;
		min = 0;
		seg=0;
		}
		
		System.out.println("Hora actual mas 1 seg -> " + hora + ":" + min + ":" + seg);
		}
		
		}
		}	

	}

}

package ivan.ActividadesTema2;

import java.util.Scanner;

public class Resuelta2_11 {
	public static void main(String[] args) {

		//Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspon-
		//diente a un día de la semana. Se debe mostrar el nombre del día de la semana al que
		//corresponde. Por ejemplo, el número 1 corresponde a «lunes» y el 6 a «sábado».
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduzca un número del 1 al 7, incluidos");
		
		int num = sc.nextInt();
		
		if (num<1 || num>7) System.out.println("El numero introducido es incorrecto");
		else {
			switch (num) {
			case 1: System.out.println("El día es Lunes ");break;
			case 2: System.out.println("El día es Martes ");break;
			case 3: System.out.println("El día es Miércoles ");break;
			case 4: System.out.println("El día es Jueves ");break;
			case 5: System.out.println("El día es Viernes ");break;
			case 6: System.out.println("El día es Sábado");break;
			case 7: System.out.println("El día es Domingo");break;
			}
		}
			
			
		
		
		
		
		
}
}
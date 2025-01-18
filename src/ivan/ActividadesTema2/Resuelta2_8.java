package ivan.ActividadesTema2;

import java.util.Locale;
import java.util.Scanner;

public class Resuelta2_8 {
	public static void main(String[] args) {
		//Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales.
		//Si no existen, habrá que indicarlo. Hay que tener en cuenta que las soluciones de una
		//ecuación de segundo grado, ax? + bx + c = 0
		
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("introduzca el valor de los 3 coeficientes");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = (b*b-4*a*c);
		double x1 = 0;
		double x2;
		
		
		if (d<0) System.out.println("no existen soluciones reales");
		if (d==0) System.out.println("no es una ecuacion de segundo grado");
		else 
		x1 = (-b-(Math.sqrt(d))/(2*a)); 
		x2 = (-b+(Math.sqrt(d))/(2*a)); 
		System.out.println("El caso un da como resultado: " + x1);
		System.out.println("El caso un da como resultado: " + x2);
		
		
		
		
		
	}

}

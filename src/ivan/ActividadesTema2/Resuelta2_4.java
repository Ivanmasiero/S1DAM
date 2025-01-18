package ivan.ActividadesTema2;

import java.util.Scanner;

public class Resuelta2_4 {

	public static void main(String[] args) {
	// vamos a comprobar que un numero sea casi-cero, es decir que se acerque a cero por menos de
	// unidad
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el numero que quiera comprobar");
		
		double num = sc.nextDouble();
		
		if (num>-1 && num<1 && num != 0) System.out.println("El numero es casi-cero");
		else System.out.println("el numero no es casi-cero");
		

	

}}

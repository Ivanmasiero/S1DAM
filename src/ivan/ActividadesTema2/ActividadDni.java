package ivan.ActividadesTema2;

import java.util.Scanner;

public class ActividadDni {

	public static void main(String[] args) {
		//
		
		final String Letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el numero de tu dni");
		
		int numDni = sc.nextInt();
		
		System.out.println("Tu dni es " + numDni + Letras.charAt(numDni%23)) ;
		
		
		
		

	}

}

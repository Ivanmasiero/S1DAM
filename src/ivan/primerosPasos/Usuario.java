package ivan.primerosPasos;

import java.util.Scanner;
public class Usuario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce tu apellido");
		String apellido = sc.nextLine();
		
		System.out.println("Introduce tu edad");
		int edad = sc.nextInt();
		
		System.out.println("Nombre: " + nombre + " " + apellido + " con " + edad + " años");
	
		

	}

}

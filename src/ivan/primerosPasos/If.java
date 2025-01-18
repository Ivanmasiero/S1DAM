package ivan.primerosPasos;

import java.util.Scanner;
public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un numero");
	int entrada = sc.nextInt();
	int entradaPositiva;
	
	if (entrada<0) {
		entradaPositiva= -entrada;
		System.out.println("numero negativo");
	}else {
		entradaPositiva = entrada;
		System.out.println("numero positivo");
	}

	}

}

package ivan.ActividadesTema2;
import java.util.Scanner;
public class Resuelta2_6 {

	public static void main(String[] args) {
		// vamos hacer la actividad 3 de nuevo, considerando que dos numeros puedan ser iguales
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca dos numeros");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1==num2) System.out.println("Los dos numeros son iguales");
		else
		if (num1>num2) System.out.println("El numero mayor es " + num1);
		else System.out.println("El numero mayor es " + num2);

	}

}
